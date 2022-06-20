
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDataBase birdDataList = new BirdDataBase();
        
        UserInterface userInterfacse = new UserInterface(scan, birdDataList);
        
        //starts the userinterface
        userInterfacse.start();

    }

}
