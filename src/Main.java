
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by luca on 08-Apr-2016
 * 
 */
public class Main {

    public static void main(String[] args) {
        int array[], limitNumber, searchedNumber;
            
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insert limit of our array");
        limitNumber = in.nextInt();
        array = new int[limitNumber];
        
        for (int i = 0; i < limitNumber; i++) {
            System.out.println("Insert number of maximium elements:");
            array[i] = in.nextInt();
        }
        
        System.out.println("Number that you're looking for:");
        searchedNumber = in.nextInt();
        //Result operation searching thanks Array.binarySearch
        int result = Arrays.binarySearch(array, searchedNumber);
        if (result > 0) {
            System.out.println("NNumer found");
        }else{
            System.out.println("Number not found");
        }
        
    }

}
