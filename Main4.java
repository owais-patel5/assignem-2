package q1;

import java.io.File;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("test.txt");
	       
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String string = scanner.nextLine();
				System.out.println(string);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("unable to read");
		}
         