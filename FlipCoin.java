package BasicPrograms;

import java.util.Random;
class Toss {
   public String chanceFunc() {
      Random r = new Random();
      int chance = r.nextInt(2);
      if (chance == 1) {
         return"tails";
      } else {
         return"heads";
      }
   }
}
/*
 * 
 */
public class FlipCoin {
   public static void main(String[] args) {
      Toss t = new Toss();
      int heads = 0;
      int tails = 0;
      int percentage = 100;
      for (int i = 1; i<= percentage; i++) {
         if (t.chanceFunc().equals("tails")) {
            tails++;
         } else {
            heads++;
         }
      }
      System.out.println("percentage = " + percentage);
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
   }
}

