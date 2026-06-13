import java.util.*;
public class Question10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[52];
        int k=0;
        for(String s:suits) for(String r:ranks) deck[k++]=r+" of "+s;
        for(int i=0;i<52;i++){
            int r=i+(int)(Math.random()*(52-i));
            String t=deck[i]; deck[i]=deck[r]; deck[r]=t;
        }
        int players=sc.nextInt();
        int cards=sc.nextInt();
        k=0;
        for(int i=0;i<players;i++){
            System.out.println("Player "+(i+1));
            for(int j=0;j<cards;j++) System.out.println(deck[k++]);
        }
    }
}