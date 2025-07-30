package operators;

import java.util.Scanner;

public class Q6_incrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number :");
		int num=sc.nextInt();
		
		num++;
		System.out.println("post increment would be : "+num);
		
		++num;
		System.out.println("pre increment would be : "+num);
		
		num--;
		System.out.println("post Decrement would be : "+num);
		
		--num;
		System.out.println("pre decrement would be : "+num);
		

	}

}
