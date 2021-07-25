package com.jizhong.pojo;

public class Student {
	private String name;//学生姓名
	
	//构造方法，初始化name属性
	public Student(String name) {
		super();
		this.name = name;
	}
	
	//打印学生名称
	public void show(){
		System.out.println(name);
	}

}
