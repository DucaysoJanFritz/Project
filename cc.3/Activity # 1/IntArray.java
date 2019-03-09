package intarray;

import java.util.Scanner;


public class IntArray {

    
    public static void main(String[] args) {

        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        int t = 0;

        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];
        int i;
        for (i = 0; i < input.length; i++) {
            System.out.println("Enter an Integer: ");
            input[i] = sc.nextInt();
        }
       
        System.out.print("First to Last: ");
        for(i = 0;i<input.length;i++){
            System.out.print(input[i]+"");
        }
        System.out.println("");
        System.out.print("Last to First: ");
        
        for (i=input.length-1; i >= 0; i--) {
            System.out.print(input[i]+"");
            
        }
    }
}
