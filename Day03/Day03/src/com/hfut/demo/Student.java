package com.hfut.demo;

public class Student {

		 //���ԣ�������
	       String number;
		   String name;
		   String address;
		   
		   
		   //��Ϊ��������
		   //void �����ķ�������
		   //introduction ������
		   void introduction(){
			   System.out.println("���ҽ���:");
		   }

		public static void main(String[] args) {
			// TODO �Զ����ɵķ������
		    //ʵ����һ���ֻ�
			Student s=new Student();
			
			s.number="2012214284";
			s.name="��ޱ";
			s.address="�����й�ҵ԰���ʰ�·1�Ÿ߲�����";
			
			s.introduction();
			System.out.println(s.number);
			System.out.println(s.name);
			System.out.println(s.address);
			
	}

}