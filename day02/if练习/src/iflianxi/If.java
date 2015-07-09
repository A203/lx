package iflianxi;

import java.util.Scanner;

public class If {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入成绩：");
		int score=input.nextInt();
		if(score>90){
			System.out.println("优秀！");
		}else if(score>80){
			System.out.println("良好！");
		}else if(score>70){
			System.out.println("合格");	
		}else if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
				}
		}

	}


