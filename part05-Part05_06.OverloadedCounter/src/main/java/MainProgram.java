
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter = new Counter(20);
        
        counter.decrease(); 
        System.out.println(counter.getValue());
        
        counter.increase();
        System.out.println(counter.getValue());
        
        counter.decrease(5);
        System.out.println(counter.getValue());
        
        counter.increase(5);
        System.out.println(counter.getValue());
        
        
                
    }
}
