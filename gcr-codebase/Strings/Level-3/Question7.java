import java.util.*;
public class Question7{
    static boolean check(String s){
        int l=0,r=s.length()-1;
        while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false;
        return true;
    }
    static boolean rec(String s,int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return rec(s,l+1,r-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--) rev+=s.charAt(i);
        System.out.println(check(s));
        System.out.println(rec(s,0,s.length()-1));
        System.out.println(s.equals(rev));
    }
}