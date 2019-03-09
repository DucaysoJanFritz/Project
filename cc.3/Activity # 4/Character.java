
package rpg;


public class Character {
    
    
    static Dice dice = new Dice();

            private final String name;
            private final int strength;
            private final int dex;
            private final int intel;

            private final int maxlife;
            private int currentlife;

            public Character(String n, int s, int d, int i) {
            this.name =n;
            this.strength = s;
            this.dex=d;
            this.intel= i;

            this.maxlife = dice.roll()+50;
            this.currentlife = maxlife; }
            public int attack() {
                int x = dice.roll()+strength;
                return x;}
            
            public void wound(int damage) {
                currentlife -= damage;}
            
            public void heal(int heal) {

               if(currentlife == maxlife){
               }
               else{
                   currentlife += heal;
               }

            }
           
            public String getName() {
                return name;
            }
            
            public int getStrength() {
                return strength;
            }
            
            public int getDexterity() {
                return dex;
            }
            
            public int getIntelligence() {
                return intel;
            }
            
            public int getCurrentLife() {

               return currentlife;
            }
            
            public int getMaxLife() {
            return maxlife;
    }
}


