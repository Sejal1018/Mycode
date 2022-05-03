package Array;
import java.util.*;

public class arrayRotated {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Input array : ");
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter how many times you want to rotate array to left : ");
        int no = sc.nextInt();
        for(int i=0;i<no;i++)
        {
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println("Output array : ");
        for(int i =0; i <arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
