package operators;

import java.util.Scanner;

public class Q3_passOrNot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the theory marks :");
	int theory=sc.nextInt();
	
	
	System.out.println("Enter the pratical marks :");
	int pratical=sc.nextInt();
	
	
	if(pratical>=50 && theory >=50) System.out.println("pass");
	else System.out.println("Fail");
	
	
	}
	

}
