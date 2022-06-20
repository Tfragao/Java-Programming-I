
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers: ");
        Statistics sum = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }     
            sum.addNumber(userInput);
            
            if (userInput % 2 == 0){
                sumEven.addNumber(userInput);
            }else {
                sumOdd.addNumber(userInput);
            }
            
        }
         
        System.out.println("Sum: " + sum.sum());    
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: " + sumOdd.sum());
    }
}
