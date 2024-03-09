import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        do {
            System.out.print("Please enter your score: ");
            score = new Scanner(System.in).nextInt();
            if (score >= 70 && score <=100) {
                System.out.println("Congrats! You've passed the test!");
            } else if (score >= 0 && score < 70) {
                System.out.println("Sorry, you've failed the test.");
            }
            else if (score < 0 || score > 100) {
                System.out.println("Incorrect value has been entered. Please enter a value from 0 to 100.");
            }
        } while (score < 0 || score > 100);
    }
}
