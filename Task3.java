import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sumOfUserInputs = 0;
        if (userInput >= 0) {
            for (int i = 0; i <= userInput; i++) {
                sumOfUserInputs += i;
            }
        } else {
            for (int i = 0; i >= userInput; i--) {
                sumOfUserInputs += i;
            }
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", userInput, sumOfUserInputs);
    }
}

