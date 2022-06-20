
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  TODO : review naming convention used for example for suitcase maybe holdList should be a better name
 * @author Tyson
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public int weightSuitcases(){
        int weight = 0;
        
        for (Suitcase suitcase : suitcases){
            weight += suitcase.totalWeight();
        }
        
        return weight;
    }
    
    public void addSuitcase(Suitcase suitcase){
       if((weightSuitcases() + suitcase.totalWeight()) <= maxWeight){
           this.suitcases.add(suitcase);
       }else{
           return;
       }
        
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
           suitcase.printItems();
        }
    }
    
    @Override
    public String toString(){
        return this.suitcases.size() + " suitcases " + "(" + weightSuitcases() + " kg" + ")";
    }
}
