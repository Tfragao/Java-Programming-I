
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube cube = new Cube(4);
        System.out.println(cube.volume());
        System.out.println(cube);
        
        System.out.println("Enter the length of the cube:");
        int length = Integer.valueOf(scanner.nextLine());
        Cube saltCube = new Cube((length));
        System.out.println(saltCube);
        
    }
}
