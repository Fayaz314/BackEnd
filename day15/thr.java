package day15;

public class thr {

	public static void main(String[] args) {
		
Thread t=Thread.currentThread();
t.setName("Fayaz");
t.setPriority(6);
System.out.println(t);
	}

}
