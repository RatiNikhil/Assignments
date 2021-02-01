// 10)Write a program to generate the first n terms in the series
// 1, 8, 27, 64, 125
import java.util.Scanner;
public class Ntermseries {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in); 
     int n,i=1;
     System.out.println("Enter the range of number(Limit):");
     n=cs.nextInt();
     while(i<=n)
     {
      System.out.print(i*i*i+" ");
      i++;
      }
      cs.close();
 }
}

