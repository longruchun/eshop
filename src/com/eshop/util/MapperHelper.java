package com.eshop.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MapperHelper {
    public <T> T getMapper(Class<T> clazz) {
    	try {
			InputStream is=Resources.getResourceAsStream("MyBatis-config.xml");
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			
			SqlSession session=factory.openSession();
			T dao=session.getMapper(clazz); 
			
			return dao;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
}
