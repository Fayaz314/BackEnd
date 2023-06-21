package day13;
import java.util.ArrayList;
import java.util.Iterator;
public class LL {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<Integer>();
		ArrayList <Integer> al2=new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println("ArrayList:"+al);
		
		Iterator <Integer> iterate=al.iterator();
		int a=iterate.next();
		System.out.println("Accessed Element"+a);
		iterate.remove();
		System.out.println("Removed Element"+a);
		System.out.println("Updated ArrayList:");
		
		
		
		

	}

}
