package com.jizhong.test;

import java.util.ArrayList;
import java.util.List;

import com.jizhong.pojo.Student;

public class StudentTest {
	public static void main(String[] args) {
		//1. 创建集合，存储学生信息
		List<Student> stuList = new ArrayList<>();
		//2. 创建学生数据
		Student stu1 = new Student("张三");
		Student stu2 = new Student("李四");
		Student stu3 = new Student("王五");
		//3. 将学生数据添加到学生集合中
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		//4. 遍历集合，调用show方法打印学生姓名
		for(int i = 0;i < stuList.size();i++){
			stuList.get(i).show();
		}
	}
}
