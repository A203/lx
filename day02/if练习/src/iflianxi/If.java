package iflianxi;

import java.util.Scanner;

public class If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("������ɼ���");
		int score=input.nextInt();
		if(score>90){
			System.out.println("���㣡");
		}else if(score>80){
			System.out.println("���ã�");
		}else if(score>70){
			System.out.println("�ϸ�");	
		}else if(score>=60){
			System.out.println("����");
		}else{
			System.out.println("������");
				}
		}

	}


