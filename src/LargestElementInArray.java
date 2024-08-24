import java.util.Scanner;

//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class LargestElementInArray {

    public static void main(String[] args){

        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sin.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of : arr[" + i + "] : ");
            arr[i] = sin.nextInt();
        }

         int max = arr[0];

         for(int i=0; i<n; i++)
         {
           if(max < arr[i])
           {
             max = arr[i];
           }
         }

         System.out.println("\nMax Element in array is : " + max);
    }
}
