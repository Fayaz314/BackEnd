package day14;
import java.util.PriorityQueue;
public class queue {

	public static void main(String[] args) {
		PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
		priorityQueue.offer(55);
		priorityQueue.offer(45);
		priorityQueue.offer(33);
		priorityQueue.offer(87);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.containsAll(priorityQueue));
		System.out.println(priorityQueue.remove(null));
	}

}
