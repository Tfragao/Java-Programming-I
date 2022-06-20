
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
public class BirdDataBase {
      private ArrayList<Bird> birdList;

    public BirdDataBase() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {

        birdList.add(bird);

    }

    public void printBirdDatabase() {

        for (Bird bird : birdList) {
            System.out.println(bird);
        }

    }

    public void printBird(String name) {

        for (Bird bird : birdList) {

            if (bird.getName().equals(name)) {

                System.out.println(bird);
            }
        }
    }

    
    public void addObservationFromDB(String name) {

        for (Bird bird : birdList) {
            if (bird.getName().toLowerCase().equals(name.toLowerCase())) {

                bird.addObservation();
            }

        }

    }
}
