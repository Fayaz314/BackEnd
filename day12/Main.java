 package day12;

public class Main {

	public static void main(String[] args) {interface Polygon {
		  void getArea(int length, int breadth);
	}

	// implement the Polygon interface
	class Rectangle implements Polygon {

	  // implementation of abstract method
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }
	}

	class hello {
	  public static void main(String[] args) {
	    Rectangle r1 = new Rectangle();
	    r1.getArea(5, 6);
	  }
	}
		// TODO Auto-generated method stub

	}

}
