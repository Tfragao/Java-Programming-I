
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class TodoList {
   private ArrayList<String> todoList;
   
    public TodoList(){
       this.todoList = new ArrayList<>();
    }
    
    public void add(String task){
        this.todoList.add(task);
    }
    
    public void print(){
        for(int i = 1; i <= todoList.size(); i++){
            System.out.println(i +": "+ todoList.get(i - 1));
        }
    }
    
    public void remove(int number){
        todoList.remove(number - 1);
    }
}
