import java.util.Scanner;
public class FloydsWhileLoop {

	public static void main(String[] args) {

 
Scanner scan=new Scanner(System.in);

  System.out.println("Enter the number of row of you want: ");
   int rows =scan.nextInt();//Takes the input from user
   int row =1;
   System.out.println("Here your floyd's triangle ");
    int i=1;
    while(i<=rows){//outer while loop
      int j=1;
      while(j<=i){//inner while loop
        System.out.print(" * ");

        row++;
        j++;
    }
    System.out.println();
   
    i++;
   }         
   }
}