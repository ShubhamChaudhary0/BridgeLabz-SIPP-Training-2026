import java.util.*;
public class Question8{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Age CanVote");
  for(int i=0;i<10;i++){
   int age=sc.nextInt();
   System.out.println(age+" "+(age>=18));
  }
 }
}