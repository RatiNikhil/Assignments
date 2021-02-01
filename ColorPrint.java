// 1) Write a program to print the color name, based on color code. If color code in not valid
 //then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 //(using switch case)

import java.util.Scanner;
 
public class ColorPrint{ 
      public static void main(String args[]){
          int cl;
          Scanner SC=new Scanner(System.in);
           
          System.out.print("Enter a color (0 to 6): ");
          cl=SC.nextInt();
           
          if(cl<0 || cl>6){
              System.out.println("Invalid weekday number.");
              System.exit(0);
          }
           

          switch(cl){
                case 0: 
                    System.out.println("Red");
                    break;
                case 1: 
                    System.out.println("Blue");
                    break;
                case 2: 
                    System.out.println("Green");
                    break;
                case 3: 
                    System.out.println("Orange");
                    break;
                case 4: 
                    System.out.println("yellow");
                    break;
                case 5: 
                    System.out.println("white");
                    break;                
                default:
                    System.out.println("Invalid");
                    break;                  
          }
           
      }
}