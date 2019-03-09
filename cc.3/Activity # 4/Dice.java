package rpg;

import java.util.Random;

public class Dice {
    
    private final Random r;
  
    
    public Dice() {
        r= new Random();      
    }
    
    public int roll() {
       int x = r.nextInt(5)+1;
       return x;
    }

    

}


