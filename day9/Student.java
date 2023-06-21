package day9;

public class Student {
int id;
String name;
int age;
String department;
Student(int i,String n,int a,String d){
id=i;
name=n;   
age=a;
department=d;
}
void display() {System.out.println(id+" "+name+" "+age+" "+department);}
public static void main(String args[]) {
	Student s1=new Student(314,"Fayaz",22,"MECH");
	Student s2=new Student(303,"Nani",22,"MECH");
	Student s3=new Student(301,"Dasta",18,"MECH" );
	s1.display();
	s2.display();
	s3.display();
}
}
