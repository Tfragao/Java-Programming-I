
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {

            System.out.println("> ");
            System.out.println("First: " + firstContainer.toString() );
            System.out.println("Second: " + secondContainer.toString());
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);

            } else if (command.equals("move")) {
                if (amount <= 0 || firstContainer.contains() == 0) {
                    return;
                }

                if (firstContainer.contains() - amount < 0) {
                    amount = firstContainer.contains();
                }

                if (amount >= 100) {
                    firstContainer.add(0);
                    secondContainer.add(100);

                } else if (secondContainer.contains() + amount <= 100) {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);

                } else if (amount + secondContainer.contains() > 100 && amount + firstContainer.contains() > 100) {
                    secondContainer.add(100);
                    firstContainer.add(0);
                }
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
            } else {
                System.out.println("Unknown command");
            }

        }

    }

}
