import java.util.*;
public class Question1{
    static String getStatus(double bmi){
        if(bmi<18.5) return "Underweight";
        if(bmi<25) return "Normal";
        if(bmi<30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }
        System.out.println("Weight Height BMI Status");
        for(int i=0;i<10;i++){
            double h=data[i][1]/100.0;
            double bmi=data[i][0]/(h*h);
            System.out.printf("%.1f %.1f %.2f %s%n",data[i][0],data[i][1],bmi,getStatus(bmi));
        }
    }
}