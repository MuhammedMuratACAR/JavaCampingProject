
public class Course {
	public Course() {
		System.out.println("Course List");
	}
	 
	public Course(int id,String name,String instructor,int progress) {
		this();
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.progress=progress;
	
		
	}
	
	
	int id;
	String name;
	String instructor;
	int progress;

}
