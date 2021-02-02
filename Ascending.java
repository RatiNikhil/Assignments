//3)Write a program in take 10 integer in an array and sort in ascending order.

import java.util.ArrayList;
import java.util.Collections;
public class Ascending {
   public static void main(String args[]) {
      ArrayList<Integer> myList = new ArrayList<Integer>();
      myList.add(50);
      myList.add(29);
      myList.add(35);
      myList.add(11);
      myList.add(78);
      myList.add(64);
      myList.add(89);
      myList.add(67);
      System.out.println("Points\n"+ myList);
      Collections.sort(myList);
      System.out.println("Points ascending order\n"+ myList);
   }
}