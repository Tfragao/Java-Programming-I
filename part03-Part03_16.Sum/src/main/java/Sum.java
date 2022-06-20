
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(23);
        numbers.add(10);
        numbers.add(11);
        
        System.out.println("Sum: " + sum(numbers));
        
    }
    
    public static int sum(ArrayList<Integer> numbers){
       int sum = 0;
       for(int number : numbers){
           sum += number;
       }
        return sum;
    }
}
