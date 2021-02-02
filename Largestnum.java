//1)Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
import java.util.*;
public class Largestnum {
   public static void main(String []args){
      int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
      System.out.println("Array = "+Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("Sorted Array = "+Arrays.toString(arr));
      System.out.println("Smallest element = "+arr[0]);
      System.out.println("second Smallest element = "+arr[0]);
      System.out.println("Largest element = "+arr[9]);
      System.out.println("second Largest element = "+arr[8]);
   }
}