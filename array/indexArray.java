package array;

import java.util.Scanner;

public class indexArray
{
    public static void indexarray(int arr[], int size)
    {
        for(int i = 0;i<size;i++){
            int curr = i;
            int value = -1;
            while(arr[curr] != -1 && arr[curr] !=curr){
                int temp = arr[curr];
                arr[curr] = value;
                value =curr=temp;

            }
            if(value!=-1){
                arr[curr] =value;
            }
        }
    
        
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        indexarray(arr,n);
        for(int i = 0;i<n;i++){
            System.out.println(" "+arr[i]);
        }

        input.close();
        
    }
    
}
