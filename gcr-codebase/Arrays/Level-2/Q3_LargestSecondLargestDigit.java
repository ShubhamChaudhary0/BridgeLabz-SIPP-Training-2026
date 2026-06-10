import java.util.Scanner;
public class Q3_LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        int[] digits = new int[10];
        int index = 0;

        while(num != 0 && index < 10){
            digits[index++] = (int)(num % 10);
            num /= 10;
        }

        int largest = -1, second = -1;

        for(int i=0;i<index;i++){
            if(digits[i] > largest){
                second = largest;
                largest = digits[i];
            } else if(digits[i] > second && digits[i] != largest){
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}