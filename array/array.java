package array;

import java.util.Scanner;

public class array{
    public static int maxSubArray(int arr[] , int size)
    {
        int maxSoFar = 0;
        int maxEndinghere = 0;

        for(int i=0;i<size;i++)
        {
            maxEndinghere = maxEndinghere + arr[i];
            if(maxEndinghere<0){
                maxEndinghere = 0;
            }
            if(maxSoFar <maxEndinghere){
                maxSoFar = maxEndinghere;
            }

        }
        return maxSoFar;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n =input.nextInt();
        System.out.println("enter the elements of array ");
        int arr [] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int size= arr.length;

        System.out.println("max sub array sum "+maxSubArray(arr,size ));
        input.close();
    }
}