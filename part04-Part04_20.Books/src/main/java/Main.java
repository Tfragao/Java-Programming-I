import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String infoTobePrinted = scanner.nextLine();
        
        if (infoTobePrinted.toLowerCase().equals("everything")){
            for(Book book : books){
                System.out.println(book.toString());
            }
        }
        if(infoTobePrinted.toLowerCase().equals("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        }
    }
}
