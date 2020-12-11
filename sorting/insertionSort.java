package sorting;
import java.util.Scanner;


public class insertionSort
{
    static Scanner input = new Scanner (System.in);

    static public  boolean more(int value1  , int value2)
    {
        return value1 > value2;//returns true for the condition to be true 
    }

    static public  void  sorting(int[] arr )
    {

        int size = arr.length;
        int j;
        for (int i = 1; i < size; i++) 
        {
            int temp = arr[i];
            //runs untill the arr[j-1] is greater than temp value 
            for (j = i; j >0 && more(arr[j-1],temp); j--) 
            {
                arr[j] = arr[j-1];
                
            }
            arr[j]=temp;            
        }
    }

    public static void main(String[] args) {
        System.out.println("the number of element in  array ");
        int n  = input.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the element in  the array ");
        for(int i = 0 ; i<arr.length;i++){
            arr[i] =input.nextInt();
            
        }
        sorting(arr);
        System.out.println("the sorted array is ");
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(" "+arr[i]);
            
        }
    }
    
}
