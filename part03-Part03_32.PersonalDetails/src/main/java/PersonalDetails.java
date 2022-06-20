
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, count = 0, longest = 0;
        String longestName = null;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            
            String[] pieces = userInput.split(",");
            String name = pieces[0];
            int birthYear = Integer.valueOf(pieces[1]);
            sum += birthYear;
            count++;
            
            int length = name.length();
            if (length > longest){
                longest = length;
                longestName = name;
            }       
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
