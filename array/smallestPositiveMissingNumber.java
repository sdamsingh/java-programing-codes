package array;
import java.util.Scanner;

public class smallestPositiveMissingNumber 
{

    static Scanner input = new Scanner(System.in);

    public static int smallestPositiveNumber(int arr [], int size )
    {
        int temp;
        for(int i=0;i<size;i++)
        {
            while(arr[i] !=i+1 && arr[i] > 0 && arr[i] <=size )
            {
                temp=arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        for(int i=0;i<size;i++)
        {

            if(arr[i] != i+1)
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int n= input.nextInt();
        int arr [] =new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print(""+smallestPositiveNumber(arr, n));        
    }
    
}
