import java.util.Scanner;

//WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION
//.

public class SumOfEvenUsingRecursion {

    public static void main(String args[]) {

        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sin.nextInt();
        int num=0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of arr[" + i + "] : ");
            arr[i] = sin.nextInt();
        }

        int sum = sumOfEven(arr, 0, num);
        System.out.println("Sum of all even numbers is: " + sum);
    }

    private static int sumOfEven(int[] arr, int sum, int i) {
        if (i < arr.length) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
            return sumOfEven(arr, sum, i + 1);
        } else {
            return sum;
        }
    }
}
