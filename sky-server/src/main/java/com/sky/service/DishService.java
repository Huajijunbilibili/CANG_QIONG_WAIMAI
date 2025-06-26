package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品及其口味
     * @param dishDTO
     * @return
     */
    public void saveWithFlavor(DishDTO dishDTO);


    /**
     * 查询菜品
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);


    /**
     * 菜品的批量删除
     * @param ids
     * @return
     */
    void deleteBatch(List<Long> ids);
}
