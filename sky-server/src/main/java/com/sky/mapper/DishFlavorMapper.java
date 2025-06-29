package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
    /**
     * 根据菜品ID删除口味
     * @param dishId
     */
    @Delete("DELETE FROM dish_flavor WHERE id = #{dishId}")
    void deleteByDishId(Long dishId);


    /**
     * 根据菜品ID批量删除口味
     * @param dishIds
     */
    void deleteByIds(List<Long> dishIds);

    /**
     * 根据菜品Id查询对应口味数据
     * @param dishId
     * @return
     */
    @Select("SELECT * FROM dish_flavor WHERE dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
