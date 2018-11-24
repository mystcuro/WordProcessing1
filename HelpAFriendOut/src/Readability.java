import java.util.*;
import java.io.*;

public class Readability{

	private Scanner file;
	
	public void openFile() {
		try {
			file = new Scanner(new File("C:\\Wspaces\\Wspace1\\HelpAFriendOut\\src\\Readme.txt")); 
		}
		catch(Exception e) {
			System.out.println("Could not Read The File!");
		}
		
	}
	
	public void readFile() {
		while(file.hasNext()) {
			String word = file.next();
			Word pass = new Word(word);
			String output = pass.toString();
			System.out.print(output+" ");
		}
	}
	
	public void closeFile() {
		file.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Readability obj = new Readability();
		obj.openFile();
		obj.readFile();
		obj.closeFile();
	}

}
