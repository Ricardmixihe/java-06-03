package com.jizhong.test;

import java.util.LinkedList;
import java.util.List;

import com.jizhong.pojo.Movie;

public class Demo02_LinkedList {
	public static void main(String[] args) {
		/**
		 	添加销售冠军、以及销售最后一名的电影DVD对象
			获取销售冠军、以及销售最后一名的电影DVD对象
			删除销售冠军、以及销售最后一名的电影DVD对象
		 */
		//1. 创建存储电影的集合LinkedList
		LinkedList<Movie> movieList = new LinkedList<>();
		//2. 创建销冠和销售最后一名
		Movie movieOne = new Movie(1, "阿凡达", 50);
		Movie movieTwo = new Movie(2, "上海堡垒", 50);
		//3. 把销冠和销售最后一名分别添加到集合头部和尾部
		//LinkedList.addFirst(Object o)：将数据添加到集合的头部
		//LinkedList.addLast(Object o)：将数据添加到集合的尾部
		movieList.addFirst(movieOne);
		movieList.addLast(movieTwo);
		
		//4. 获取销售冠军、以及销售最后一名的电影DVD对象
		//LinkedList.getFirst()：获取集合中头部元素
		//LinkedList.getLast()：获取集合中尾部元素
		Movie first = movieList.getFirst();//销冠
		Movie last = movieList.getLast();//销售最后一名
		System.out.println("电影票房销售冠军是：" + first.getMovieName());
		System.out.println("电影票房销售最后一名是：" + last.getMovieName());
		
		//5. 删除销售冠军、以及销售最后一名的电影DVD对象
		//LinkedList.removeFirst()：删除集合中的第一个元素
		//LinkedList.removeLast()：删除集合中的最后一个元素
		movieList.removeFirst();//删除销冠
		movieList.removeLast();//删除销售最后一名
		
		//6. 打印数组长度
		//LinkedList.size()：获取集合长度
		System.out.println(movieList.size());
		
	}
}
