package day15;
import java.util.*;
public class SingleThread {
	public static void main(String []args) {
	

	

	System.out.println("assignment writing");
	System.out.println("assign the assignment");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("The assignment"+a);



	
		for(int i=0;i<=5;i ++)
			
		{
			System.out.println("printing assignment");
			try {
				Thread.sleep(5000);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println("assignment end");
		// TODO Auto-generated method stub

	}

}
 