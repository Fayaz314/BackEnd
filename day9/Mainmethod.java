package day9;


	class Mainmethod {
		  private String name;

		  
		  Mainmethod() {
		    System.out.println("Constructor Called:");
		    name = "Fayaz";
		  }

		  public static void main(String[] args) {

		
		    Mainmethod obj = new Mainmethod();
		    System.out.println("The Student name is " + obj.name);
		  }
		}

	

	
