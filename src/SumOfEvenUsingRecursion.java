import java.util.Scanner;

//WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION
//.

public class SumOfEvenUsingRecursion {

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sin.nextInt();

        int sum = sumOfEven(0, 1, n);
        System.out.println("\nSum of all even numbers is: " + sum);
    }

    private static int sumOfEven(int sum, int i,int n) {
        if (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            return sumOfEven(sum, i+1, n);
        } else {
            return sum;
        }
    }
}
