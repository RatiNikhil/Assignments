// 11) Write a program to generate the first n prime numbers in the series
//2,3,5,7,9,11,..., 17

public class generateNnumbers

{
   public static void main(String args[])
   {
      int n;
      int status = 1;
      int num = 3;
      System.out.println("First 7 prime numbers are:");   
      System.out.println(2);
      for ( int i = 2 ; i <=7 ;  )
      {
         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            System.out.println(num);
            i++;
         }
         status = 1;
         num++;
      }         
   }
}