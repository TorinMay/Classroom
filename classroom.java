import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.Arrays;

class classroom{

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
		String student;
		try {
			File students = new File("class.csv");
			Scanner scan = new Scanner(students);
			while(scan.hasNext()) {
				student = scan.next();
				String[] names = new String[]{student};
				for (int i=0; i<names.length; i++) {
					System.out.println(names[i]);
				}
			}
		
		}catch(IOException e){
				System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
	}

	// public static String random(String student) {
	// 	String randomName;
	//  	Random random = new Random();
	//  	for (int i=0; i<names.length; i++) {
	//  		randomName = random.next(names[i]);
	//  		String[] names = new String[]{student};
	//  	}
	 	
	//  	return randomName;
	// }
	
	public static void groups() {
		try {
			String student;
			File students = new File("class.csv");
			Scanner scan = new Scanner(students);
				while(scan.hasNext()) {
					student = scan.next();
					String[] names = new String[]{student};
					for (int i=0; i<names.length; i++) {
						System.out.println(names[3]);
					}
				}
		}catch(IOException e) {
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
	}

	public static void exit() {
		System.out.println("Thank you for using EZSchool!");
		System.exit(0);
	}
}