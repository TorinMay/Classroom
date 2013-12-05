import java.util.Scanner;
import java.util.Random;
import java.io.*;

class classroom {
	public static void main(String[] args) throws IOException {
	//imports file
		System.out.println();
		System.out.println("Quick School Lookup");
		System.out.println("---------------------------");
		System.out.println("What would you like to do?");
		System.out.println("---------------------------");
		System.out.println("Press 1 to Show Students.");
		System.out.println("Press 2 to select a random Student.");
		System.out.println("Press 3 to show student groups.");
		System.out.println("Press 4 to exit.");
		System.out.println();
		System.out.print("Choice: ");
		Scanner option = new Scanner(System.in);
		int choice = option.nextInt();

		if(choice == 1) {
			students();
		}else if(choice == 2) {
			// random();
		}else if(choice == 3) {
			groups();
		}else if(choice == 4) {
			exit();
		}

		
	}

	public static void students() {
		int student;
		File students = new File("class.csv");
		Scanner scan = new Scanner(students);
		student = scan.nextInt();
		try() {

		}catch(){

		}
	}

	public static void random() {
	 	// Random randomName = new Random();
	 	// int randomName = r.nextInt(students.length);
	 	// return randomName;
	}
	
	public static void groups() {

	}

	public static void exit() {
		System.exit(0);
	}
}
