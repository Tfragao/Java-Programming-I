/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class Item {
    private String identifier;
    private String itemName;
    
    public Item(String id, String name){
        this.identifier = id;
        this.itemName = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.itemName;
    }
    
    @Override
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Item)){
            return false;
        }
        
        Item itemCompared = (Item)compared;
        
        if (this.identifier.equals(itemCompared.identifier)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.itemName;
    }
}
