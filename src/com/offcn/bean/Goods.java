package com.offcn.bean;

public class Goods {

	private Integer id;
	private String name;
	private Category category;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer id, String name, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", category=" + category
				+ "]";
	}
	
}
