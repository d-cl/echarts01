package com.offcn.bean;

public class Sta {

	private String name;
	private Integer stock;
	private Integer sales;
	public Sta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sta(String name, Integer stock, Integer sales) {
		super();
		this.name = name;
		this.stock = stock;
		this.sales = sales;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getstock() {
		return stock;
	}
	public void setstock(Integer stock) {
		this.stock = stock;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "Sta [name=" + name + ", stock=" + stock + ", sales=" + sales
				+ "]";
	}
	
}
