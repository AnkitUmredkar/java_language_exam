import java.util.Scanner;

//WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

public class AscendingOrder {

    public static void main(String[] args){

        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sin.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of : arr[" + i + "] : ");
            arr[i] = sin.nextInt();
        }

         for(int i=0; i<n; i++)
         {
           for(int j=i+1; j<n; j++)
           {
             if(arr[i] > arr[j])
             {
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
             }
           }
         }

        System.out.print("\nAscending order of array is below :");

         for(int elem : arr){
             System.out.print(elem);
         }
    }
}
