package sorting;
import java.util.Scanner;

public class mergeSort
{
    
    public static void merg(int [] arr ,int [] temp, int lower,int upper) 
    {
        if(lower>=upper){
            return ;
        }

        int middle = (lower+upper)/2;

        merg(arr, temp, lower, middle);
        merg(arr, temp, middle+1, upper);

        int lowerStart = lower;
        int lowerStop = middle;
        int upperStart = middle+1;
        int upperStop = upper;
        int count = lower;


        while(lowerStart<=lowerStop && upperStart<=upperStop)
        {
            if(arr[lowerStart]<arr[upperStart]){
                temp[count++]=arr[lowerStart++];                
            }else{
                temp[count++] = arr[upperStart++];
            }

        }
        while(lowerStart<=lowerStop){
            temp[count++]=arr[lowerStart++];
        }
        while (upperStart<=upperStop)
        {
            temp[count++] = arr[upperStart++];
            
        }
        for (int i = lower; i <=upper; i++) 
        {
            arr[i] = temp[i];
            
        }
        
    }

    public static void sorted(int [] arr ) 
    {
        int size =arr.length;
        int [] temp = new int[size];
        merg(arr, temp, 0, size-1);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of element in array ");
        int n = input.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = input.nextInt();
            
        }
        System.out.println("unsorted array is ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(" "+arr[i]);
            
        }
        System.out.println();
        System.out.println("the sorted array using merge sort is ");
        sorted(arr);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(" "+arr[i]);
            
        }


        input.close();

    }
    
}
