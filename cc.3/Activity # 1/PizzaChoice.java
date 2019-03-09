
package pizzachoice;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaChoice {

    
    String decision = "Yes";
    
    
    
    public static void main(String[] args) {
        
        
        String [] size = {"S","M","L","XL"};    
        double [] price = {6.99, 8.99,12.99, 15.00};
        double pizza = 0;
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Please enter a letter for pizza size you want.");
        System.out.println("S = Small\nM = Medium\nL = Large\nXL = Extra Large");
        System.out.println(Arrays.deepToString(size));
        
        String pizzaSize = sc.next();
        
        if(pizzaSize.equals(size[0])){
            pizza = price[0];
        }
        else if(pizzaSize.equals(size[1])){
            pizza = price[1];
            
        }
        else if(pizzaSize.equals(size[2])){
            pizza = price[2];

        } else if(pizzaSize.equals(size[3])){
            pizza = price[3];
        }
        System.out.println("Size: "+pizzaSize+"   \nPrice: "+pizza);
        
        System.out.println("Would you like to choose another size?");
        String userDecision = sc.next();
            
                    
        }
               
            
    }
   

    

