import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filePractice {

	public static void main(String[] args) throws IOException {
		
		
		//Step 1
		//Create a File
//		File notePad= new File("C:\\Users\\Pedro\\eclipse-workspace\\Class12\\hello.txt");
//		notePad.createNewFile();
		
		//Step 2
		//Called
//		
//		FileWriter fileWrite= new FileWriter("C:\\Users\\Pedro\\eclipse-workspace\\Class12\\hello.txt");
//		BufferedWriter bWriter= new BufferedWriter(fileWrite);
//		bWriter.write("Hello World 123");
//		bWriter.newLine();
//		bWriter.write("ABC");
//		bWriter.flush();
		
		
		FileReader fReader= new FileReader("C:\\Users\\Pedro\\eclipse-workspace\\Class12\\hello.txt");
		
		BufferedReader bReader= new BufferedReader(fReader);
		
		
		String i;
		while((i=bReader.readLine())!=null){
			System.out.println(i);
		
			
			}
		

	}

}
