package com.jizhong.test;

import java.util.ArrayList;
import java.util.List;

import com.jizhong.pojo.Movie;

public class Demo01_ArrayList {
	public static void main(String[] args) {
		//1. 创建集合,存储电影(movie)对象
		//new ArrayList<>()
		List<Movie> movieList = new ArrayList<>();
		//2. 提供电影数据
		Movie movie1 = new Movie(1, "速度与激情9", 50);
		Movie movie2 = new Movie(2, "速度与激情8", 40);
		Movie movie3 = new Movie(3, "速度与激情7", 30);
		//3. 添加数据到集合中
		//List.add(Object o)：在集合的尾部添加一条数据
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		//4. 遍历集合，获取集合中的每一个元素
		//List.size()：获取集合长度
		
		//6. 在指定的位置添加电影DVD。
		//add(int index,Object o)：在指定index位置添加o对象
		//ArrayList集合对象是一个有序集合（添加顺序）
		Movie movie4 = new Movie(4, "复仇者联盟4", 50);
		movieList.add(2, movie4);
		
		//7. 判断是否已经存在了“复仇者联盟”电影DVD。
		//如果存在打印该电影已经存在，不存在则打印不存在
		//List.contains(Object o)：判断集合中是否包含某个o元素
		if (movieList.contains(movie4)) {
			System.out.println(movie4.getMovieName() + "已经存在了！！");
		}else{
			System.out.println(movie4.getMovieName() + "不存在");
		}
		
		//8. 删除"复仇者联盟4"电影DVD。
		//List.remove(Object o || int index)：
		/**
		 * Object o：删除数组中的指定对象
		 * int index：删除数组中指定索引位置的对象
		 */
		movieList.remove(2);
		
		for(int i = 0;i < movieList.size();i++){
			//List.get(index)：获取集合中指定索引位置的元素
			Movie m = movieList.get(i);
			//5. 打印集合中都有哪些电影 （名称）
			String movieName = m.getMovieName();
			System.out.println(movieName);
		}
		
		/**
		 * ArrayList常用方法：
		 * List.add(Object o)：在集合的尾部添加一条数据
		 * List.size()：获取集合长度
		 * List.get(index)：获取集合中指定索引位置的元素
		 * List.add(int index,Object o)：在指定index位置添加o对象
		 * List.contains(Object o)：判断集合中是否包含某个o元素
		 * List.remove(Object o || int index)：删除指定对象或者指定索引位置对象
		 */
		
	}
}
