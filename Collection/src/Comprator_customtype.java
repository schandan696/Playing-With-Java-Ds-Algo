import java.util.ArrayList;
import java.util.List;

public class Comprator_customtype {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,52));
		studs.add(new Student(2,91));
		studs.add(new Student(3,39));
		studs.add(new Student(4,67));
		studs.add(new Student(5,73));
		studs.add(new Student(6,95));
		
		for(Student s: studs){
			
			System.out.println(s);
			
		}
	}
}

class Student
{
	int rollno;
	int marks;
	public Student(int rollno, int marks)
	{
			this.rollno=rollno;
			this.marks=marks;	
	}
}