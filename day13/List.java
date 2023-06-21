package day13;
import java.util.LinkedList;
public class List {

	public static void main(String[] args) {
		LinkedList <Integer> L1=new LinkedList<Integer>();
		L1.add(5);
		L1.add(6);
		L1.add(7);
		L1.add(8);
		L1.remove(1);
		for(int a:L1)
		{
			System.out.println(a);
		}
		

	}

}
 