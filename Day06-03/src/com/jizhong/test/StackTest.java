package com.jizhong.test;

import java.util.LinkedList;

import com.jizhong.pojo.Stack;

public class StackTest {
	public static void main(String[] args) {
		/*
		 	使用LinkedList实现堆栈
			在向LinkedList中添加时，使用addLast方法
			在从LinkedList中取出时，使用removeLast方法
		 */
		//1. 使用LinkedList实现堆栈，创建LinkedList集合
		LinkedList<Stack> stacks = new LinkedList<>();//模拟栈空间
		//2. 创建栈类对象
		Stack s1 = new Stack("栈资源01");
		Stack s2 = new Stack("栈资源02");
		Stack s3 = new Stack("栈资源03");
		//3. 在向LinkedList中添加时，使用addLast方法
		stacks.addLast(s1);
		stacks.addLast(s2);
		stacks.addLast(s3);
		//4. 在从LinkedList中取出时，使用getLast方法获取栈资源，removeLast()删除栈资源
		int size = stacks.size();//3
		for(int i = 0;i < size;i++){//3 2 1
			Stack s = stacks.getLast();//03  
			System.out.println(s.getName());
			stacks.removeLast();//弹栈  栈资源应该消失
		}
	}
}
