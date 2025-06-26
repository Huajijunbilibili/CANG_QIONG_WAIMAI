package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;

public interface DishService {

    /**
     * 新增菜品及其口味
     * @param dishDTO
     * @return
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
