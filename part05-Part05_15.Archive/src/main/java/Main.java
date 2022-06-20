
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();
        
        while (true) {
            System.out.println("identifier (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            
            Item item = new Item(id, name); 
            if(itemList.contains(item)){
                 System.out.println("Item already in the list");
            }else{
               itemList.add(item);
            }
                     
        }
        System.out.println("==Items==");
        for (Item item : itemList){
            System.out.println(item.toString());  
        }

    }
}
