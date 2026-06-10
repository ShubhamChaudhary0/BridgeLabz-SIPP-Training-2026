import java.util.Scanner;
public class Q9_StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                marks[i][j] = sc.nextDouble();
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if(percentage[i] >= 90) grade[i] = 'A';
            else if(percentage[i] >= 75) grade[i] = 'B';
            else if(percentage[i] >= 60) grade[i] = 'C';
            else if(percentage[i] >= 40) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for(int i=0;i<n;i++){
            System.out.println("Percentage=" + percentage[i] + " Grade=" + grade[i]);
        }
    }
}