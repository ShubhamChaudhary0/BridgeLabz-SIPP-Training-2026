import java.util.*;
public class Q6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt(),akbarAge=sc.nextInt(),anthonyAge=sc.nextInt();
        double amarH=sc.nextDouble(),akbarH=sc.nextDouble(),anthonyH=sc.nextDouble();
        String youngest=(amarAge<=akbarAge&&amarAge<=anthonyAge)?"Amar":(akbarAge<=anthonyAge?"Akbar":"Anthony");
        String tallest=(amarH>=akbarH&&amarH>=anthonyH)?"Amar":(akbarH>=anthonyH?"Akbar":"Anthony");
        System.out.println("Youngest Friend: "+youngest);
        System.out.println("Tallest Friend: "+tallest);
    }
}