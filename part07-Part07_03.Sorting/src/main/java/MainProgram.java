
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }
    
    public static int smallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        int smallest = array[0];
        
        for(int i = 0; i < array.length;i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        if(array.length == 0){
            return 0;
        }
        int smallest = array[0];
        int index = 0;
        for(int i = 0; i < array.length;i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        if(table.length == 0){
            return 0;
        }
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length;i++){
            if(smallest > table[i]){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        if(array.length == 0){
            return;
        }
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        if(array.length == 0){
            return;
        }
        for(int startIndex = 0; startIndex < array.length; startIndex++){
          int index1 =  indexOfSmallestFrom(array, startIndex);
            swap(array, startIndex, index1);
            System.out.println(Arrays.toString(array));            
        }
    }

}
