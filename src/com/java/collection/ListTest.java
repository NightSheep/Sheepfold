package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 备选课程类
 * @author oldsheepccc
 */
public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	/**
	 * 往coursesToSelect中添加备选课程 
	 */
	public void testAdd(){
		//创建一个课程对象，并通过调用add方法，添加到备选课程List中
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2","C语言");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp2.id+":"+temp2.name);
		
		//下面的方法会抛出数组下标越界异常
		//Course cr3 = new Course("3","java语言");
		//coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","离散数学"),new Course("4","汇编语言")}; 
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("添加了两门课程:"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();
		lt.testAdd();
		
	}

}
