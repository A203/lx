package com.hfut.demo;

public class Person {
	
	String name;
	int age;
	String address;
 /*	
  //�޲�Ĭ�Ϲ��췽��
	Person(){
		System.out.println("Person��Ĭ�Ϲ��췽�������á�");
	}
 */
	
	//�вι��췽��
	Person(String n,int a,String add){
		name=n;
		age=a;
		address=add;
	}
	//���ҽ���
	void introduce(){
		System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ�����"+address);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Person person=new Person();//ʵ����һ��person����
//		person.name="����";
//		person.age=20;
//		person.address="USA";
		
		Person person=new Person("jim",30,"����");
		person.introduce();

	}

}
//��û�й��췽��ʱ��ϵͳ���Զ�����һ��Ĭ�Ϲ��췽��
//���췽����һ�ֱȽ�����ķ���
//û�з�������ʱ������������ͬ��