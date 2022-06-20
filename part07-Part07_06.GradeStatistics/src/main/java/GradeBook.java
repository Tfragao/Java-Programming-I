
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
public class GradeBook {
    private ArrayList<Integer> grades;
    
    public GradeBook(){
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade){
       if(grade >=0 && grade <= 100){
           this.grades.add(grade);
       } 
    }
    
    public String gradeAverage(){
        int sum = 0;
        double average = 0.0;
        
        for(int grade : this.grades){
            sum += grade;
        }
        
        average = 1.0 * sum / this.grades.size();
        
        return average + "";
    }
    
    public String gradeAveragePassing(){
        double average = 0;
        int sum = 0;
        int passingCount = 0;
        
        for(int grade : this.grades){
            if (grade > 49){
                passingCount++;
                sum += grade;
            }
        }
        
        average = 1.0 * sum / passingCount;
        
        if(sum== 0){
            return "-";
        }else{
            return average + "";
        }
                
    }
    
    public String passingPercentage(){
        double percentage = 0.0;
        int passingCount = 0;
        
        for(int grade : this.grades){
            if(grade > 49){
                passingCount++;
            }
        }
        
        percentage = 100.0 * passingCount / this.grades.size();
        return percentage + "";
    }
    
    public void printGradeDistribution() {

        int[] gradeDistArr = new int[6]; 
        
        for (int grade : this.grades) {

            if (grade >= 90) {
                gradeDistArr[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); 
            gradDistIndex--;
        }

    }
    
    public void printGrades() {

        System.out.print("Point average (all): " + this.gradeAverage() + "\n"
                + "Point average (passing): " + this.gradeAveragePassing() + "\n"
                + "Pass percentage: " + this.passingPercentage() + "\n");

        printGradeDistribution();

    }
    
    
}
