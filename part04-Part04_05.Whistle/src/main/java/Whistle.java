/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class Whistle {
    private String sound;
    
    public Whistle(String soundWhistle){
        this.sound = soundWhistle;
    }
    
    public void sound(){
        System.out.println(this.sound);
    }
}
