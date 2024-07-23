import java.io.*;

public class FileWriter {
	private PrintWriter printer;
	
	public FileWriter(String dbFile) {
		try {
			File courseFile = new File(dbFile);
			printer = new PrintWriter(new FileOutputStream(courseFile, false));
		}
		catch(FileNotFoundException e) {
			System.err.println("file " + dbFile + "isn found or doesnt exist");
		}
	}
	public void writeToFile(Course course) {
		printer.println(course.dbString());
	}
	
	public void close() {
		printer.close();
	}
}
