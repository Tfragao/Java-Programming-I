
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
        int sum = 0, totalInputted = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else if (userInput > 0) {
                totalInputted++;
                sum += userInput;
                average = sum / (double) totalInputted;
            }
        }
        if (totalInputted == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }


    }
}
