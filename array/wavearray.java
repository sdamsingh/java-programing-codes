package array;

import java.util.Scanner;


public class wavearray 
{
    static Scanner input = new Scanner(System.in);
    public static void swap(int arr[],int a ,int b) 
    {
        int temp = arr[b];
        arr[b] =arr[a];
        arr[a] =temp;
        
    }
    public static void waveFormarray(int arr[]) 
    {
        // pass ana array and print out a array in the form  of wave
        int size = arr.length;
        for(int i = 1 ; i<size ; i+=2 )
        {
            if((i-1)>=0 && arr[i]> arr[i-1])
            {
                //Todo swap the element
                swap(arr, i, i-1);                
            }
            if((i+1)<size && arr[i]>arr[i+1])
            {
                swap(arr, i, i+1);
            }
        } 
    }
    public static void main(String[] args) {
        System.out.println("enter the number of  element ");
        int n = input.nextInt();
        int arr [] = new int [n];
        System.out.println("enter the element of  array  ");
        for(int i =0;i<n;i++){
            arr[i] = input.nextInt();
        }
        waveFormarray(arr);
        for(int i =0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

        
    }

    
}
