package nianyueri;

import java.util.Scanner;

public class NianYueRi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("年：");
		int year=input.nextInt();
		System.out.print("月：");
		int month=input.nextInt();
		boolean isRN=false;
		if(year%400==0||(year%4==0&&year%100!=0)){
			isRN=true;
		}else{
			isRN=false;
		}
		switch(month){
		    case 1:
			    System.out.println("31天");
			    break;
		    case 2:
		        System.out.println(isRN?"29天":"28天");
		    	break;
		    case 3:
		    	System.out.println("31天");
		    	break;
		    case 4:
		    	System.out.println("30天");
		    	break;
		    case 5:
		    	System.out.println("31天");
		    	break;
		    case 6:
		    	System.out.println("30天");
		    	break;
		    case 7:
		    	System.out.println("31天");
		    	break;
		    case 8:
		    	System.out.println("31天");
		    	break;
		    case 9:
		    	System.out.println("30天");
		    	break;
		    case 10:
		    	System.out.println("31天");
		    	break;
		    case 11:
		    	System.out.println("30天");
		    	break;
		    case 12:
		    	System.out.println("31天");
		    	break;
		    default:
		    	System.out.println("月份不合法！");
		    	break;
		    }
		

	}

}
