
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
    private GradeBook gradeBook;
    
    public UserInterface(Scanner scanner, GradeBook gradeBook){
        this.scanner = scanner;
        this.gradeBook = gradeBook;
    }
    
    public void start(){
        System.out.println("Enter points total, -1 stops:");
        while(true){
            int gradePoint = Integer.valueOf(scanner.nextLine());
            
            if(gradePoint == -1){
                gradeBook.printGrades();
                break;
            }else{
                gradeBook.addGrade(gradePoint);
            }
        }
    }
}
