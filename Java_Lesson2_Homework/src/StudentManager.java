
public class StudentManager {

	
	public void studentList(Student student) {
		System.out.println(student.name + " " + student.age + " " + student.city + " " + student.mail);
	}
	
	  public void addToStudent(Student student){
	        System.out.println(student.name + " " + student.age + " " + student.city + " " + student.mail+" == "+"Student succesfully added:)");
	    }
	  
	  public void deleteToStudent(Student student){
	        System.out.println(student.name + " " + student.age + " " + student.city + " " + student.mail+" == "+"Student succesfully delete:)");
	    }
}


