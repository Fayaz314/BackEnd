package day12;

public class Student {
	int rollno;
	String name;
	static String college="CBIT";
	Student(int r,String n){
		rollno=r;
		name=n;
	
				
	}
	void display() {System.out.println(rollno+" "+name+" "+college);}

	public static void main(String[] args) {
		
		Student s1=new Student(314,"Fayaz");
		Student s2=new Student(303,"Narayana");
		Student s3=new Student(304,"Satish");
		Student s4=new Student(313,"Anzar");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		

	}

}
