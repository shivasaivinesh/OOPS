package operators;
import java.util.Scanner;

public class Q5_CompoundAssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any numner :");
		int num=sc.nextInt();
		System.out.println("Initial Value : "+num);
		
		num+=5;
		System.out.println("After adding +5 : "+num);
		
		num*=10;
		System.out.println("After multiplying *10 : "+num);
		
		
		num-=2;
		System.out.println("After subtracting -2 : "+num );
		

	}

}
