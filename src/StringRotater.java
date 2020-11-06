import java.util.Scanner;

public class StringRotater {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput;
        System.out.print("Enter the string :");
        userInput = scanner.nextLine();

        int number;

        // ask the user to input a number until a valid number is entered
        while (true) {
            System.out.print("Enter the number: ");
            String input = scanner.nextLine();
            try {
                // try to parse the input as integer
                // if unsuccessful, show an error to user and restart the loop
                number= Integer.parseInt(input);

                // the number cannot be greater than the string's length
                if (number > userInput.length()) {
                    System.out.println("The number cannot be greater than the length of the string");
                    continue;
                }
                // the number cannot be a negative number
                else if (number < 0) {
                    System.out.println("The number is less then 0");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Only numbers are allowed.");
                continue;
            }
            break;
        }

        String subString;
        String concat;

        // take a substring for the overflow and concatenate it
        subString= userInput.substring( userInput.length() - number);
        concat = userInput.substring(0,userInput.length() - number);
        System.out.println(userInput + " rotated by " + number + " is " + subString.concat(concat));

    }
}
