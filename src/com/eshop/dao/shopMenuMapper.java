package com.eshop.dao;

import java.util.List;

import com.eshop.model.shopMenu;
import com.eshop.model.shopMenuKey;

public interface shopMenuMapper {
    int deleteByPrimaryKey(shopMenuKey key);

    int insert(shopMenu record);

    int insertSelective(shopMenu record);

    shopMenu selectByPrimaryKey(Integer i);

    int updateByPrimaryKeySelective(shopMenu record);

    int updateByPrimaryKey(shopMenu record);
    
    List<shopMenu> getAll();
    
    List<shopMenu> getModelsByPid(int pid);
}