package com.hfut.demo;

public class Phone {
	  //���ԣ�������
	   String name;
	   String brand;
	   int price;
	   
	   //��Ϊ��������
	   //void �����ķ�������
	   //call ������
	   void newcall(){
		   System.out.println("��绰....");
	   }
	   void sendMsg(){
		   System.out.println("������....");
	   }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	    //ʵ����һ���ֻ�
		Phone p=new Phone();
		
		p.name="note";
		p.brand="���׻�";
		p.price=99;
		
		System.out.println(p.name);
		p.sendMsg();
		 
	}

}
