package com.example.ex_springcloud.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;

import com.example.ex_springcloud.product.dao.CategoryDao;
import com.example.ex_springcloud.product.entity.CategoryEntity;
import com.example.ex_springcloud.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //找出全部分類
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //找出所有一級分類
        List<CategoryEntity> categoryOfLv1Entities = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(lv1menu -> {
                    lv1menu.setChildren(getChildrens(lv1menu, categoryEntities));
                    return lv1menu;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());
        return categoryOfLv1Entities;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> categoryEntities = all.stream().filter(categoryEntity -> {
            return  categoryEntity.getParentCid()==root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return  categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }) .collect(Collectors.toList());;
        return categoryEntities;
    }
}