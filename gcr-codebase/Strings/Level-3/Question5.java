import java.util.*;
public class Question5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] f=new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            boolean first=true;
            for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)) first=false;
            if(first) System.out.println(s.charAt(i)+" : "+f[s.charAt(i)]);
        }
    }
}