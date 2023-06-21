package day10;

class MethodOverloading {

    // this method accepts int
    private static void display(int a){
        System.out.println("Only One Student is Pass.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("  Remaining All Students are Failed.");
    }

    public static void main(String[] args) {
    	System.out.println("Got Exam Results."); 
        display(1 );
        display("FAIZ");
    }
}
  