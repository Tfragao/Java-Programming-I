/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class Timer {
    private ClockHand hundrethsSecond;
    private ClockHand seconds;
    
    public Timer(){
        this.hundrethsSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
       this.hundrethsSecond.advance();
       
       if(this.hundrethsSecond.value()== 0){ //That means counter value has reached 100
           this.seconds.advance();
       }
    }
    
    @Override
    public String toString(){
        return this.seconds + ":" + this.hundrethsSecond;
    }
}
