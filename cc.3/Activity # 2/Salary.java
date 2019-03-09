
package salary;

import java.util.*;
public class Salary {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Gross Weekly: ");
        double grossweekly = sc.nextFloat();
        double bonuspercentage = 0.085;
        double bonus = (double) (bonuspercentage * grossweekly);
        double netweeklysalary = netweekly(grossweekly,bonuspercentage);
        
        System.out.println("*****WASD Net Cafe*****");
        System.out.println("Employee Name: "+ name);
        System.out.println("Gross Salary: "+ grossweekly);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Net Weekly Salary: "+ netweeklysalary);
        System.out.println("Classification: "+ classify(netweeklysalary));
    }
    public static double netweekly(double grossweeklysale, double bonuspercentage){
        double bonus = (double) (bonuspercentage * grossweeklysale);
        double weeklysalary = (double) (bonus + 1500);
        return weeklysalary;
    }
    public static String classify(double weeklysalary){
        String employeeclassification = "";
        
        if (weeklysalary <= 1999 && weeklysalary >= 1500){
            employeeclassification = "Q";
            
        }else if(weeklysalary >= 2000 && weeklysalary <= 2499){
            employeeclassification = "W";            
        }else if(weeklysalary >= 2500 && weeklysalary <= 2999){
            employeeclassification = "E";
        }else if(weeklysalary >= 3000 && weeklysalary <= 3499){
            employeeclassification = "R";
        }else if(weeklysalary >= 3500 && weeklysalary <= 3999){
            employeeclassification = "T";
        }else if(weeklysalary >= 4000){
            employeeclassification = "Y";
        }else{
            employeeclassification = "No Classification";
        }
        return employeeclassification;
    }
}
