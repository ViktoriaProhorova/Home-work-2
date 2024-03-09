import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String inputString = new String();
        Scanner scanner = new Scanner(System.in);
        while (!inputString.equalsIgnoreCase("Exit")) {
            System.out.print("Please enter something ");
            inputString = scanner.nextLine();
        }
    }
}
