import java.util.*;
public class Question5{
 static boolean vowel(char c){
  c=Character.toLowerCase(c);
  return "aeiou".indexOf(c)>=0;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int v=0,con=0;
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(Character.isLetter(c)){
    if(vowel(c)) v++; else con++;
   }
  }
  System.out.println("Vowels="+v);
  System.out.println("Consonants="+con);
 }
}