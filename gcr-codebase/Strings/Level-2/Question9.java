import java.util.*;
public class Question9{
 static String comp(){
  String[] a={"rock","paper","scissors"};
  return a[(int)(Math.random()*3)];
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int user=0,computer=0;
  for(int i=0;i<n;i++){
   String u=sc.next();
   String c=comp();
   if(u.equals(c)) continue;
   else if((u.equals("rock")&&c.equals("scissors"))||(u.equals("paper")&&c.equals("rock"))||(u.equals("scissors")&&c.equals("paper"))) user++;
   else computer++;
  }
  System.out.println("User="+user);
  System.out.println("Computer="+computer);
 }
}