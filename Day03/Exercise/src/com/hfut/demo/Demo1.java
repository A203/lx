package com.hfut.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person person=new Person("jim",20,"USA");
		person.introduce();
	}

}


class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//thisָ��ǰʵ�����󣬡��ҡ�  ���﷨�൱�ڡ��ġ�
		this.age=age;	
	}
	public Person(String name,int age,String address){
		this(name,age);//����ǰ��Ĵ����������Ĺ��췽��
		this.address=address;
	}
	
	void hello(){
		System.out.println("hello....");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress"+this.address);
		this.hello();//this.����ʡ��
		System.out.println(this);
	}
}

/*
 thisָ��ǰ����
 
 1.this�������ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ�����
 2.this�������ڵ��ù��췽�������ٴ������ࣨ�ڹ��췽����ͨ��this�����������췽�����������ǵ�һ�䣩
 3.this�������ڵ��ó�Ա���Ժͳ�Ա����
 */