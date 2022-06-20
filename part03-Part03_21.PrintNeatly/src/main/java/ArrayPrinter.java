
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        for (int value : array){
            
              if (index != array.length - 1){
                  System.out.print(value + "," + " "); 
                  index++;
              }else{
                  System.out.print(value);
              }
                  
        }
    }
}
