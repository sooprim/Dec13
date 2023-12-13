package ass1;
import	java.io.*;

public class Input2 {
	public static void main(String[] args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		System.out.print("Input Name: ");
		try {
			//name
			String name = "";
			name = input.readLine();
			System.out.println("Your Name is: " + name);
		
			//year
			String year = "";
			System.out.print("Input Year of Birth: ");
		
			year = input.readLine();
			int y = Integer.parseInt(year);
			System.out.println("Your Age: " + (2023 - y) + " years old");
		
			//height
			String height = "";
			System.out.print("Input Height: ");
		
			height = input.readLine();
			double h = Double.parseDouble(height);
			System.out.println("Your Height: " + (h) + " meters");
		
			//weight
			String weight = "";
			System.out.print("Input Weight: ");
			weight = input.readLine();
			double w = Double.parseDouble(weight);
			System.out.println("Your BMI: " + (w / (h*h)));
		}
		
		catch (Exception e) {
			System.out.println("An exception occurred");
		}
	}
}
