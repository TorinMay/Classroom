import java.util.Scanner;
import java.util.Random;
import java.io.*;

class classroom {
	public static void main(String[] args) throws IOException {
	//imports file
		// String[] names = new String[](students);
		int student;
		File students = new File("class.csv"); // WHY WON'T THIS WORK!!!!!!
		Scanner scan = new Scanner(students);
		student = scan.nextInt();
		System.out.println(student);
		while(scan.hasNextInt()) {
			
			System.out.println(student);
		 }
	}

	public void randomStudent() {
		Random r = new Random();


	}
}
