package com.hfut.demo;

//һ����������г��󷽷�����������ǳ�����
public abstract class Animal {
	public abstract void sleep();
}

//���׼̳г����࣬����Ҫʵ�ָ����е����г��󷽷�����������Ҳ�ǳ����
//abstract class Tiger extends Animal{
class Tiger extends Animal{
	
	public void sleep() {
		// TODO �Զ����ɵķ������
	System.out.println("ſ��˯������");
	}
}
 
class Monkey extends Animal{
	public void sleep(){
		System.out.println("����˯������");
	}	
}
//ĳ�����ǳ����࣬�������п���û�г��󷽷�