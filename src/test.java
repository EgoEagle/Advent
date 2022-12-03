import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int max = 0;
		int second = 0;
		int third = 0;
		int current = 0;
		File file = new File("input.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String value = scanner.nextLine();
			if(value.matches(".*[0-9].*")) {
				current += Integer.valueOf(value);
			}
			
			else if(value =="") {
				if(current > max) {
					third = second;
					second = max;
					max = current;
				}
				else if(current < max && current > second) {
					third = second;
					second = current;
				}
				else if(current < second && current > third) {
					third = current;
				}
				current = 0;
			}
			
		}
		if(current > max) {
			if(current > max)  {
				third = second;
				second = max;
				max = current;
			}
			else if(current < max && current > second)  {
				third = second;
				second = current;
			}
			else if(current < second && current > third) {
				third = current;
			}
			current = 0;
		}
		System.out.println(max+second+third);

	}

}