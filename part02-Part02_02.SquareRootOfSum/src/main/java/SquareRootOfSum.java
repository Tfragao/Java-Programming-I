
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give first integer");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second integer");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println((int)Math.sqrt(first + second));

    }
}
