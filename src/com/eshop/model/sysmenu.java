package com.eshop.model;

import java.util.List;

public class sysmenu {
	   int id;

	   String text;
	   String href;	
 
       List<sysmenu> nodes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public List<sysmenu> getNodes() {
		return nodes;
	}

	public void setNodes(List<sysmenu> nodes) {
		this.nodes = nodes;
	}
       
       
}
