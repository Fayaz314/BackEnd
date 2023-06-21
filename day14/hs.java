package day14;
import java.util.LinkedHashSet;
public class hs {

	public static void main(String[] args) {
		LinkedHashSet<Integer>F=new LinkedHashSet<>();
		F.add(7);
		F.add(10);
		F.add(5);
		F.add(3);
		F.add(2);
		System.out.println(F.hashCode());
		System.out.println(F);

	}

}
