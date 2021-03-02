package ro.tuiasi.ac;

public class TestStudentApp {

	public static void main(String[] args) {
		System.out.println("Main for Student App project");
		//declares a student
		Student s1 = new Student(10,"a","b");
		Student s2 = new Student(33,"Popescu","Ion");
		Student s3 = new Student(34,"Ionica","Laur");
		
		s1.print();
		s2.print();
		System.out.println(s3);
		
	}

}
