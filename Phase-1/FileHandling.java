package assignment;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileHandling {
	public static void main(String[] args) throws Exception {
		File file = new File("E:PracticeAssignment");
		try {
			boolean createFile = file.createNewFile();
			if (createFile) {
				System.out.println("New File is created.");      
			} else {
				System.out.println("File already exists.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File read Sucessfully\n");
		System.out.println("Writing file");
		try {
			String s = "Course : JAVA FSD\n";
			String s1 = "Training : Phase-1\n";
			try (FileWriter fw = new FileWriter("E:PracticeAssignment")) {
				fw.write(s);
				fw.write(s1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		FileReader filereadObj = new FileReader("E:PracticeAssignment");
		int iterator;
		while ((iterator = filereadObj.read()) != -1)
			System.out.print((char) iterator);
		filereadObj.close();
		System.out.println("File written Sucessfully\n");
		System.out.println("Appending to file");
		String s = "Topic : FileHandling\n";
		try {
			FileWriter fw = new FileWriter("E:PracticeAssignment", true);
			fw.write(s);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		FileReader filereadObj1 = new FileReader("E:PracticeAssignment");
		int iterator1;
		while ((iterator1 = filereadObj1.read()) != -1)
			System.out.print((char) iterator1);
		filereadObj1.close();
		System.out.println("File Appended Sucessfully");
	}
}
