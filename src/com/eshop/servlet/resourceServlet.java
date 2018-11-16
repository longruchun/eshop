package com.eshop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshop.biz.IshopMenuBiz;
import com.eshop.biz.impl.shopMenuBizImpl;
import com.eshop.model.sysmenu;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/resourceServlet")
public class resourceServlet extends BaseServlet {
	
	public IshopMenuBiz biz;
	
  

	public void setBiz(IshopMenuBiz biz) {
		this.biz = biz;
	}

	public String getMenu(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	
    
    	List<sysmenu> list=biz.getMenus();
    	
    	ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(list);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		response.getWriter().print(json);
    	
    	
    	return "ajax"; 
    }
}
