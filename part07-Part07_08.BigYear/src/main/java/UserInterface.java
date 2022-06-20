import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class UserInterface {
     private Scanner scanner;
    private BirdDataBase birdlist;

    public UserInterface(Scanner scanner, BirdDataBase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {

        {

            boolean shouldLoop = true;

            try {

                while (shouldLoop) {
                    System.out.print("? ");
                    
                    String command = scanner.nextLine();

                    switch (command.toLowerCase()) {
                        case "quit":

                            shouldLoop = false;
                            break;
                        case "add":
                            System.out.print("Name ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Name in Latin ");
                            String latinName = scanner.nextLine();

                            birdlist.addBird(new Bird(name, latinName));

                            break;
                        case "observation":

                            name = scanner.nextLine();

                            birdlist.addObservationFromDB(name);

                            break;
                        case "all":
                            birdlist.printBirdDatabase();

                            break;
                        case "one":
                            name = scanner.nextLine();

                            birdlist.printBird(name);

                            break;
                        default:
                            System.out.println("Unknown command");

                    }

                }

                
            } catch (Exception error) {
                System.out.println("There was an error msg is " + error.getMessage());

            }

        }

    }
}
