package array;
import java.util.Scanner;

public class MaxMinArray 
{
    static Scanner input = new Scanner(System.in);
    static int [] maxMinArray(int [] arr ,int size)
    {
        int aux [] = new int [size];
        for(int i=0;i<size;i++){
            aux[i] =arr[i];
        }



        int start = 0;
        int stop = size-1;
        for(int i=0;i<size ;i++){
            if(i%2==0){
                arr[i] = aux[stop];
                stop -= 1;
            }else{
                arr[i]= aux[start];
                start += 1;
            }
        }
        return arr;

    }
    public static void main(String[] args)
    {
        int n = input.nextInt();
        int arr [] = new int [n];

        for(int i = 0 ; i<n;i++)
        {
            arr[i] =input.nextInt();

        }
        maxMinArray(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
        
    }
    
}
