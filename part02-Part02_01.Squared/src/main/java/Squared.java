
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer");
        int value = Integer.valueOf(scanner.nextLine());
        
        System.out.println(value * value);

    }
}
