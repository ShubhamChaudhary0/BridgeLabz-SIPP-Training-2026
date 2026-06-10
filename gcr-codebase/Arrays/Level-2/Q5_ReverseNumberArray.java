import java.util.Scanner;
public class Q5_ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int[] arr = new int[s.length()];

        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i) - '0';
        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}