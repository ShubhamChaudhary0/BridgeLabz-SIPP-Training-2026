import java.util.*;
public class Q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(),i=1;
        while(i<number){
            if(number%i==0) System.out.print(i+" ");
            i++;
        }
    }
}