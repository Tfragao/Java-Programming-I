/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class Container {
    private int amountContainer;
    public Container(){
       this.amountContainer = 0; 
    }
    
    public int contains(){
        
        return this.amountContainer;
    }
    
    public void add(int amount){
        if (amount <= 0) {
            return;
        }
        if((amount + this.amountContainer) <= 100){
             this.amountContainer += amount;
        }else if((amount + this.amountContainer) > 100){
            this.amountContainer = 100;
        }
       
    }
    
    public void remove(int amount){
        if (amount <= 0){
            return;
        }
        if(amount > this.amountContainer){
            this.amountContainer = 0;
        }else{
            this.amountContainer -= amount;
        }
        
    }
    
    
    public String toString(){
        return  this.amountContainer + "/100";
    }
}
