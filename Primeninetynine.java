// 4) Write a program to print prime numbers between 10 and 99
import java.util.Scanner;

public class Primeninetynine {

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
    
     int a, b, i, j, flag;
     
     System.out.printf("Enter starting value: ");
     a = sc.nextInt(); // Take input

   
     System.out.printf("\nEnter last value: ");
     b = sc.nextInt(); // Take input

     
     System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

     
     for (i = a; i <= b; i++) {

         if (i == 1 || i == 0)
             continue;

        
         flag = 1;

         for (j = 2; j <= i / 2; ++j) {
             if (i % j == 0) {
                 flag = 0;
                 break;
             }
         }

       
         if (flag == 1)
             System.out.println(i);
     }
 }
}