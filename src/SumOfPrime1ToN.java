import java.util.Scanner;

//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.

public class SumOfPrime1ToN {

    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sin.nextInt();
        int sum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of : arr[" + i + "] : ");
            arr[i] = sin.nextInt();
        }

        System.out.print("\nThe All prime Number is : ");
        for (int i = 1; i <= arr.length; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i + " ");
                sum = sum + i;
            }
        }

        System.out.print("\nThe All prime Number's sum is : " + sum);


    }

    private static boolean isPrime(int i) {
        boolean check = true;
        if (i == 1) {
            return false;
        }

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                check = false;
                break;
            }
        }

        return check;
    }
}
