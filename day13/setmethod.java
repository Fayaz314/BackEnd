package day13;
import java.util.ArrayList;
public class setmethod {

	public static void main(String[] args) {
		ArrayList <Integer> Generics=new ArrayList<>();
		Generics.add(22);
		Generics.add(40);
		Generics.add(256);
		Generics.add(540);
		System.out.println("ArrayList:"+ Generics);
		
		Integer a=Generics.get(0);
		System.out.println("Element 0"+a);

	}

}
