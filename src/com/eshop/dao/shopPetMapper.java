package com.eshop.dao;

import com.eshop.model.shopPet;

public interface shopPetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopPet record);

    int insertSelective(shopPet record);

    shopPet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopPet record);

    int updateByPrimaryKey(shopPet record);
}