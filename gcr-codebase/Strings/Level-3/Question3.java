import java.util.*;
public class Question3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] f=new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(f[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}