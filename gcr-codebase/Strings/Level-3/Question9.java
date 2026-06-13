import java.util.*;
public class Question9{
    static boolean leap(int y){return (y%400==0)||(y%4==0&&y%100!=0);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt();
        String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(leap(y)) days[2]=29;
        System.out.println(months[m]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        Calendar c=Calendar.getInstance();
        c.set(y,m-1,1);
        int first=c.get(Calendar.DAY_OF_WEEK)-1;
        for(int i=0;i<first;i++) System.out.print("    ");
        for(int d=1;d<=days[m];d++){
            System.out.printf("%3d ",d);
            if((d+first)%7==0) System.out.println();
        }
    }
}