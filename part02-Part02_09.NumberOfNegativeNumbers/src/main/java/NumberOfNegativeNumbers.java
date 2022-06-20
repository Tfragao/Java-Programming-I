
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalInputted = 0;
        
        while (true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            } else if (userInput < 0){
                totalInputted++;
            }
        }
        System.out.println("Number of negative numbers: " + totalInputted);
    }
}
