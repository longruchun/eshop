package com.eshop.dao;

import com.eshop.model.shopAdmin;

public interface shopAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shopAdmin record);

    int insertSelective(shopAdmin record);//qqq

    shopAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shopAdmin record);

    int updateByPrimaryKey(shopAdmin record);
}