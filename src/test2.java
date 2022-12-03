import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int score = 0;
		File file = new File("input.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String value = scanner.nextLine();
			if(value.contains("X")) score++;
			else if(value.contains("Y")) score+=2;
			else if(value.contains("Z")) score+=3;
			
			if(value.contains("A X") || value.contains("B Y") || value.contains("C Z") )score+= 3;
			else if(value.contains("A Y")) score+= 6;
			else if(value.contains("B Z")) score+= 6;
			else if(value.contains("C X")) score+= 6;
			
			
		}
		System.out.println(score);
	}

}
