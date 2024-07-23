import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileReader {
	private Scanner input;
	
	public FileReader(String dbFile) {
		try {
			File courseFile = new File(dbFile);
			input = new Scanner(courseFile);
			
		}
		catch(FileNotFoundException e) {
			System.err.println("file" + dbFile + "couldnt be found or doesnt exist");
		}
	}
	
	public Course readFromFile() {
		if(input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(",");
			if(!tokens[0].equals("Course")) {
				Course course = new Course(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
				return course;
			}
		}
		return null;
	}
	public List<Course> readCourseFromFile(){
		List<Course> courseList = new ArrayList<>();
		while(input.hasNextLine()) {
			courseList.add(readFromFile());
		}
		return courseList;
	}
}
