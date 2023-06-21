package day14;
import java.util.*;
public class stk {

	public static void main(String[] args) {
		Stack<String> obj=new Stack<>();
		Stack<Integer> A1=new Stack<>();
		obj.add("Fayaz");
		obj.add("Unknown");
		obj.add("Satie Pandu");
		obj.add("Narayana");
		obj.getClass();
		obj.empty();
		obj.contains("Narayana");
		obj.remove(1);
		for(String a:obj) {
			System.out.println(a);
			
		}
		A1.add(44);
		A1.add(35);
		A1.add(25);
		A1.add(85);
		System.out.println("Stack :"+ A1);
		

	}

}
