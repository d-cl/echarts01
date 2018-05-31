package com.offcn.bean;

public class GCSize {

	private String name;
	private Integer value;
	public GCSize() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GCSize(String name, Integer value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getvalue() {
		return value;
	}
	public void setvalue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "GCSize [name=" + name + ", value=" + value + "]";
	}
	
}
