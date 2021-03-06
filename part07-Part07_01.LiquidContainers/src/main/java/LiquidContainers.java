
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0, secondContainer = 0;
        while (true) {
            System.out.println("> ");
            
            System.out.println("First: " + firstContainer + "/100\n");
            System.out.println("Second: " + secondContainer + "/100\n");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
           
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if(amount <= 0){
                    return;
                }
                if ((amount + firstContainer) <=100 ) {
                    firstContainer += amount;
                    
                } else if ((amount + firstContainer) > 100 ) {
                    firstContainer = 100;
                }
            }else if(command.equals("move")){
                if(amount <= 0 || firstContainer == 0){
                    return;
                }
                
                if(firstContainer - amount < 0){
                    amount = firstContainer;
                }
                
                if(amount >= 100){
                    firstContainer = 0;
                    secondContainer = 100; 
                    
                }else if(secondContainer + amount <= 100){
                    secondContainer += amount;
                    firstContainer -= amount;
                }else if(amount + secondContainer > 100 && amount + firstContainer > 100){
                    secondContainer = 100;
                    firstContainer = 0;
                }
                
                
            }else if(command.equals("remove")){
                if(amount <= 0){
                    return;
                }
                
                if(amount > secondContainer){
                    amount = 0;
                }else{
                    secondContainer -= amount;
                }
            }else{
                System.out.println("Unknown command");
            }
            
        }
    }

}
