package com.eshop.dao;

import com.eshop.model.shopPetowner;

public interface shopPetownerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopPetowner record);

    int insertSelective(shopPetowner record);

    shopPetowner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopPetowner record);

    int updateByPrimaryKey(shopPetowner record);
}