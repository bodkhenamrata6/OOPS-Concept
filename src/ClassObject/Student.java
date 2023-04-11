package ClassObject;

public class Student {
	
	int student_id;
	String student_name;

	public static void main(String[] args) {
		//class is a set of objects which having certain set of properties and behaviors.
		//it does not have physical memory it is blueprint ,not real - world entity.
		//it is combination of different data type and memories.
		//data members
		//methods
		//nested class
		//interface
		//constructors
		Student s1=new Student();
		s1.student_id=1;
		s1.student_name="Namrata";
		
		System.out.println("Student Id: "+s1.student_id );
		System.out.println("Student Id: "+s1.student_name );
		
		
		

	}

}
