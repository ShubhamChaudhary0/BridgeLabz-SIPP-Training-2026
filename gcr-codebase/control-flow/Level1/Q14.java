import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fact=1;
        int i=1;
        while(i<=n){ fact*=i; i++; }
        System.out.println("Factorial = " + fact);
    }
}