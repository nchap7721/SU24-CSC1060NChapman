import java.io.IOException;
import java.util.ArrayList;

public class CSclasses {

	public static void main(String[] args) throws IOException{
		String dbFile = "CSClasses.csv";
		Course course = new Course("CP1025" , 15, 20, 3);
		InPersonCourse inPerson = new InPersonCourse("BP2012");
		FullRemoteCourse remote = new FullRemoteCourse("JackBlack@CCCS.edu");
		RealTimeRemoteCourse remote2 = new RealTimeRemoteCourse("ZoomRoom2");
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(inPerson);
		courseList.add(remote);
		courseList.add(remote2);
		
		System.out.println("regular output:");
		for (int i = 0; i < courseList.size(); i ++) {
			printDetails(courseList.get(i));
		}
		
		System.out.println("writing to file " + dbFile + ".\n");
		FileWriter fileWriter = new FileWriter(dbFile);
		for(Course course: myCourseList) {
			fileWriter.writeToFile(course);
			
		}
		fileWriter.close();
		
		System.out.println("reading from file " + dbFile + ":");
		FileReader fileReader = new FileReader(dbFile);
		List<Course> course = fileReader.readCourseFromFile();
		for(Course course: courses) {
			System.out.println(course.toString());
		}
	}
	
	public static void printDetails(Course course) {
		System.out.println("course number: " + course.getCourseNum());
		System.out.println("number of students: " + course.getNumStud());
	}
}
	public String UseTo(inPerson, remote, remote2) {
		
	}

