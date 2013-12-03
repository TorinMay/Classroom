import java.util.Scanner;
import java.util.Random;
import java.io.*;

class classroom {
	public static void main(String[] args) throws IOException {
	//imports file
		int student;
		File students = new File("class.csv");
		Scanner scan = new Scanner(students);
		student = scan.nextInt();
		System.out.println(student);
	}

	public void randomStudent() {
		Random r = new Random();

	}
}
