package day14;
import java.util.HashMap;
import java.util.Map;
public class Mm {

	public static void main(String[] args) {
		Map<Integer,String>F=new HashMap<>();
		F.put(1, "Fayaz");
		F.put(2," Nani");
		F.put(3, "Satish");
		F.put(4, "Anzar");
		System.out.println("Map:" +F);
		System.out.println("Key:"+F.keySet());
		System.out.println("Values:" +F.values());
		System.out.println("Entry:" +F.entrySet());
	  

	}

}
 