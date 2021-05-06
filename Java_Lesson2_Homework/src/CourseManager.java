
public class CourseManager {

	public void courseList(Course course) {
		System.out.println("Registered Courses " + course.name + course.instructor);
	}
	
	  public void addToCourse(Course course){
	        System.out.println(course.name+" "+course.instructor+" "+course.progress+" == "+"Course succesfully added:)");
	    }
}

