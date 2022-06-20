
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("first value");
        s.add("second value");  //LIFO : "second value" is in the top of stack
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        String taken = s.take(); // it removes "second value" from the top of stack
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }
}
