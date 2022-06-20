
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = null;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            
            String[] pieces = userInput.split(",");
            int age = Integer.valueOf(pieces[1]);
            if(age > oldest){
                oldest = age;
                name = pieces[0];
            }     
        }
        
        System.out.println("Name of the oldest: " + name); 
    }
}
