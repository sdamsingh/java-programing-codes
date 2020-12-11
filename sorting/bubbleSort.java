package sorting;
import java.util.Scanner;


public class bubbleSort {

    static Scanner input  = new Scanner(System.in);

    static public void sorted(int [] arr){
        int swapped = 1;
        for (int i = 0; i <arr.length-1 && swapped==1 ; i++) 
        {
            swapped =0;
            for (int j = 0; j < arr.length-i-1; j++) 
            {
                
                if (arr[j]>arr[j+1])
                {
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = 1;
                
                }                
            }           
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        int n = input.nextInt();

        int  [] arr  =new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = input.nextInt();            
        }
        System.out.println("the unsorted array is ");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(" " +arr[i]);
            
        }
        sorted(arr);       
        System.out.println("the sorted array is ");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(" " +arr[i]);
            
        }
        input.close();

    }
    
}
