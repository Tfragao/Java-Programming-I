
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("last");
        
        removeLast(list);
        
        for(String string : list){
             System.out.println(string);
        }  
    }
    
    public static void removeLast(ArrayList<String> list){
        if(list == null || list.isEmpty()){
            
        }else{
            list.remove(list.size() - 1);
        }
    }
}
