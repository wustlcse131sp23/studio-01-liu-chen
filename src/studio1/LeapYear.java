package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int n1=in.nextInt();
		boolean leap = (n1%4==0 && n1%100 !=0)||(n1%400==0);
		System.out.println (n1+"is" + leap + "year");
	}

}
