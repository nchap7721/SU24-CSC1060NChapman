import java.util.ArrayList;

public class CSclasses {

	public static void main(String[] args) {
		Course course = new Course("CP1025" , 15, 20, 3);
		InPersonCourse inPerson = new InPersonCourse("BP2012");
		FullRemoteCourse remote = new FullRemoteCourse("JackBlack@CCCS.edu");
		RealTimeRemoteCourse remote2 = new RealTimeRemoteCourse("ZoomRoom2");
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(inPerson);
		courseList.add(remote);
		courseList.add(remote2);
		
		
	}
}
	public String UseTo(inPerson, remote, remote2) {
		
	}

