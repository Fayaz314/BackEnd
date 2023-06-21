package day9;

class integer {

	  int i;

	  
	  private integer() {
	    i = 5;
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	    
	    integer obj = new integer();
	    System.out.println("Value of i: " + obj.i);
	  }
	}
