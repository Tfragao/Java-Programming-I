
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
         
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                addWord();
                continue;
                              
            }else if(command.equals("search")){
                System.out.println("To be translated: ");
                String wordTranslated = scanner.nextLine(); 
                
                if(this.dictionary.translate(wordTranslated) == null){
                     System.out.println("Word " + wordTranslated + " was not found");
                     continue;                    
                }else{                   
                    System.out.println("Translation: " + this.dictionary.translate(wordTranslated));
                    continue;   
                }
                                                      
            }else{
                System.out.println("Unknown command");
                continue;
            }
                        
        }
        
    }
    
    public void addWord(){
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
}
