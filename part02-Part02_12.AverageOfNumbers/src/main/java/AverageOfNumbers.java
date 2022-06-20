
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, totalInputted = 0;
        double average = 0.0;
        while (true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }
            totalInputted++;
            sum += userInput;
        }
        average = sum / (double)totalInputted;
        System.out.println("Average of the numbers: " + average);
    }
}
