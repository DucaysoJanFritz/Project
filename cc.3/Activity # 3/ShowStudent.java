
package showstudent;


public class ShowStudent {

   
    public static void main(String[] args) {
        
        Student sss = new Student();
        
        sss.setIdNumber("18-4585-473");
        System.out.println("Idnumber: " + sss.getIdNumber());
        
        sss.setCreditHours(6);
        System.out.println("CreditHours: " + sss.getCreditHours());
        
        sss.setPoints();
        System.out.println("Points: " + sss.getPoints());
        
        
        System.out.println("Average: " + sss.finalAverage());
        
        System.out.println("Scale: " + sss.displayScale());
       
    }
    
}

