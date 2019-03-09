
package exponent2;
import java.util.Scanner;

public class Exponent2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square root of " + num + " is: " + getSquareroot(num));
        System.out.println("Cuberoot of " + num + " is: " +getCuberoot(num));
    }public static int getSquareroot(int x){
        return getCuberoot(x*x) ;
    }public static int getCuberoot(int x){
        return (x * x * x);
    }
    
}
