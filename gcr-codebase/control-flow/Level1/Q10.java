import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double n=sc.nextDouble();
        while(n!=0){
            total+=n;
            n=sc.nextDouble();
        }
        System.out.println("Total = " + total);
    }
}