import java.util.*;
public class Question10{
 static String grade(double p){
  if(p>=80)return "A";
  if(p>=70)return "B";
  if(p>=60)return "C";
  if(p>=50)return "D";
  if(p>=40)return "E";
  return "R";
 }
 public static void main(String[] args){
  int[][] m=new int[10][3];
  for(int i=0;i<10;i++)
   for(int j=0;j<3;j++)
    m[i][j]=10+(int)(Math.random()*90);
  for(int i=0;i<10;i++){
   int total=m[i][0]+m[i][1]+m[i][2];
   double per=total/3.0;
   System.out.println(total+" "+per+" "+grade(per));
  }
 }
}