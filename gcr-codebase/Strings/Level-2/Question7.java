import java.util.*;
public class Question7{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int start=0,end=s.length()-1;
  while(start<s.length()&&s.charAt(start)==' ') start++;
  while(end>=0&&s.charAt(end)==' ') end--;
  String ans="";
  for(int i=start;i<=end;i++) ans+=s.charAt(i);
  System.out.println(ans);
  System.out.println(ans.equals(s.trim()));
 }
}