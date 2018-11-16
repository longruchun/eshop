package com.eshop.biz.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.stereotype.Service;

import com.eshop.biz.IshopMenuBiz;
import com.eshop.dao.shopMenuMapper;
import com.eshop.model.shopMenu;
import com.eshop.model.sysmenu;
import com.eshop.util.MapperHelper;

@Service("shopMemuImpl")
public class shopMenuBizImpl implements IshopMenuBiz {
    
	shopMenuMapper dao=new MapperHelper().getMapper(shopMenuMapper.class);
	
	@Override
	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(shopMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(shopMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public shopMenu selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		shopMenu sm= dao.selectByPrimaryKey(1);
		System.out.println(sm.getText());
		return sm;
	}
	
	

	@Override
	public int updateByPrimaryKeySelective(shopMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(shopMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<shopMenu> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public List<shopMenu> getModelsByPid(int pid) {
		// TODO Auto-generated method stub
		return dao.getModelsByPid(pid);
	}
	
	
	public List<sysmenu> getMenus() {
		// TODO Auto-generated method stub
		List<sysmenu> menus=new ArrayList<sysmenu>();
		
		
		List<shopMenu> items=dao.getModelsByPid(0);
		for(int i=0;i<items.size();i++) {
			menus.add(getMenu(items.get(i).getId()));
		}
		
		
		return menus;
	}
	
	
	
	private sysmenu getMenu(int menuId) {
		//实例化一个以menuId为id 的menu的实例对象
		sysmenu menuNode=new sysmenu();
		
		shopMenu item=new shopMenu();
		List<sysmenu> nodes=new ArrayList<sysmenu>();

 	    item=dao.selectByPrimaryKey(menuId);
 	    
 	    menuNode.setId(item.getId());
 	    menuNode.setText(item.getText());
 	    menuNode.setHref(item.getHref());
 
 	   
 	    List<shopMenu> sub_menuitems=new ArrayList<shopMenu>(); 
 	    sub_menuitems=dao.getModelsByPid(menuId);//儿子这一层的菜单全部在这里边
 	    for(int i=0;i<sub_menuitems.size();i++) {
 	    	nodes.add(getMenu(sub_menuitems.get(i).getId()));
 	    	
 	    }
 	    menuNode.setNodes(nodes);
 	   
 		return menuNode;
	}

}
