import java.util.Scanner;

public class PrintNumber {

	
	public int calc(int number){
	
	return 2*number;
	}

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
	PrintNumber pn = new PrintNumber();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + pn.calc(number));
    }
}