
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 1, 2020);
        System.out.println(date);
        date.advance();
        System.out.println(date);
        
        date.advance(5);
        System.out.println(date);
        
        SimpleDate newDate = date.afterNumberOfDays(5);
        System.out.println(newDate);
    }
}
