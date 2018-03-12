package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ��ѡ�γ���
 * @author oldsheepccc
 */
public class ListTest {
	/**
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	/**
	 * ��coursesToSelect�����ӱ�ѡ�γ� 
	 */
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ������add���������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("�����˿γ�:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("�����˿γ�:"+temp2.id+":"+temp2.name);
		
		//����ķ������׳������±�Խ���쳣
		//Course cr3 = new Course("3","java����");
		//coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")}; 
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("���������ſγ�:"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest lt = new ListTest();
		lt.testAdd();
		
	}

}