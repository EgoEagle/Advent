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
			if(value.contains("X")) {  //LOSE
				if(value.contains("A")) score+=3;
				else if(value.contains("B")) score++;
				else if(value.contains("C")) score+=2;
			}
			
			else if(value.contains("Y")) { //DRAW
				score+=3;
				if(value.contains("A")) score+=1;
				else if(value.contains("B")) score+=2;
				else if(value.contains("C")) score+=3;
			}
			
			else if(value.contains("Z")) { //WIN
				score+=6;
				if(value.contains("A")) score+=2;
				else if(value.contains("B")) score+=3;
				else if(value.contains("C")) score++;
			}
			
			
		}
		System.out.println(score);
	}

}
