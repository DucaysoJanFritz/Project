package showstudent;

    public class Student {
        
    private String IdNumber;
    private int creditHours;
    private int points;
    
    public Student(){
    this.IdNumber = " *";
    this.creditHours = 1;
    this.points = 5;
    }
    public String getIdNumber(){
        return IdNumber;
    }
    public int getCreditHours(){
        return creditHours;
    }
    public int getPoints(){
        return points;
    }
    public void setIdNumber(String IdNumber){
        this.IdNumber = IdNumber;
    }
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }
    public void setPoints(){
        this.points = creditHours * 4;
    }
    
    public double finalAverage(){
        double result = 0;
        result=points/creditHours;
        return result;
    }
    
    public String displayScale(){
        String scale=" ";
        if (points == 12){
            scale = "A";
    }else if (points == 16){
        scale = "B";
    }else if (points == 20){
        scale = "C";
    }else if(points == 24){
        scale = "D";
    }
    return scale ;
    }
}
