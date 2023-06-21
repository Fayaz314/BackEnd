public class String {
public static void main(String[]args) {
	String s1="Fayaz";
	String s2="Man";
	if(s1==s2) {
		System.out.println("referances are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
	if(s1.equals(s2))
	{
		System.out.println("strings are equal");
		
	}
	else
	{
		System.out.println("strings are unequal");
		
	}
}
}