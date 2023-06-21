package day13;

import java.util.ArrayList;
import java.util.Iterator;
public class arr1 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("arpita");
		a1.add("tejeswini");
		a1.add("vinod");
		a1.add("kiran");
		a1.add("rajeshwari");
		
		System.out.println(a1);
	
		
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			if((it.next()).equals("vinod"))
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(a1);

	}

}
