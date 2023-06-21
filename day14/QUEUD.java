package day14;
import java.util.PriorityQueue;

public class QUEUD {

	public static void main(String[] args) {
		PriorityQueue<Integer> E=new PriorityQueue<>();
		E.add(8);
		E.add(6);
		E.add(2);
		E.add(1);
		System.out.println(E);
		System.out.println(E.poll());
		
		System.out.println(E.poll());
		
		System.out.println(E.poll());
		System.out.println(E.poll()); 
		
	}

}
