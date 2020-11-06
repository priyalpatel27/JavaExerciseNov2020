import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {

        int userInput;

        Scanner scanner = new Scanner(System.in);

        // ask the user to input a number until a valid number is entered
        while (true) {
            System.out.print("Enter a number:" );
            String input = scanner.nextLine();

            // try to parse the input as integer
            // if unsuccessful, show an error to user and restart the loop
            try {
                userInput = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Only numbers are allowed.");
                continue;
            }

            // break outside of the loop because the input is a valid number
            break;
        }

        int[] array = {1,5,2,1,10};
        int above = 0;
        int below = 0;
        //int equals = 0;

        for (int i = 0;i < array.length;i++) {
            if (userInput < array[i]) {
                above++;
            }
            else if (userInput > array[i]) {
                below++;
            } else {
                //optionally, handle the case where the number is in the array.
                //equals++;
            }
        }
        System.out.println("above: " + above +", below: " + below );
    }
}
