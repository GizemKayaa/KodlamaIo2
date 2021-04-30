package kodlamaIo2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gizem");
		student.setLastName("Kaya");
		student.setEmail("giizeeem61@gmail.com");
		student.setAge(21);
		student.setStudentNo(123);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Abc");
		instructor.setLastName("Sanri");
		instructor.setEmail("abcsanri@gmail.com");
		instructor.setAge(30);
		instructor.setSalary(10000);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.cancel(student);
		studentManager.addLesson();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.cancel(instructor);
		instructorManager.selectLesson();
		

	}

}
