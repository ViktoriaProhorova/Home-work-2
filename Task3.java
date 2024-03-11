import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sumOfUserInputs = 0;

        for (int i = 0; i <= Math.abs(userInput); i++) {
            sumOfUserInputs += i;
        }

        if (userInput >= 0) {
            System.out.printf("The sum of all numbers from 0 to %d is %d", userInput, sumOfUserInputs);
        } else {
            System.out.printf("The sum of all numbers from %d to 0 is %d", userInput, (sumOfUserInputs * -1));
        }
    }
}

