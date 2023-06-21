package day15;

public class thg {

	public void run() {
		
		int s=10;
		int a=45;
		int c=s+a;
		System.out.println("Thread started running");
		System.out.println("Sum of two numbers is"  +  c);
		
		

	}
	public static void main(String[]args) {
		Thread t1=new Thread();
		System.out.println(t1);
	}

}
