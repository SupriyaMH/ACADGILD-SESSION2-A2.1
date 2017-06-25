package assignments;

import java.util.Scanner;

public class HighestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value for x y and z");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x>y&&x>z)
		{
			System.out.println("x is greater than y and z and x is"+x);
		}
		
		else if(y>x&&y>z)
		{
			System.out.println("y is greater than x and z and y is"+y);
		}
		
		else
		{
			System.out.println("z is greater than x and y and z is" +z);
		}
		
	}

}
