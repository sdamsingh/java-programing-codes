package array;

import java.util.Scanner;

public class maxindexdiffer 
{
    static Scanner input = new Scanner(System.in);
    public static int maxDifferindex(int [] arr , int size) 
    {
        int [] leftmin = new int [size];//minimum array that stores the value i
        int [] rightmax = new int [size];//maximum array that storess the value of  j
        leftmin[0] =arr[0]; //initilalizing the value of 0 th postion in min array as the value of arr[0]
        int maxdiffer;
        int i ;
        int j;
        
        for(i=1;i<size;i++){
            if(leftmin[i-1]<arr[i]){
                leftmin[i] = leftmin[i-1];
            }else{
                leftmin[i] = arr[i];
            }
        }

        //storing the value of the maximum array as the size -1 value of the original array 
        rightmax[size-1] = arr[size-1];
        for(i=size-2;i>=0;i--){
            if(rightmax[i+1]>arr[i]){
                rightmax[i] = rightmax[i+1];
            }else{
                rightmax[i] =arr[i];
            }

        }
        i=0;
        j=0;
        maxdiffer = -1;

        //comparing and finding  the maximum difference between the index
        while(j<size && i< size)
        {
            if(leftmin[i]<rightmax[i]){
                maxdiffer = Math.max(maxdiffer, j-i);
                j=j+1;
            }else{
                i=i+1;
            }

        }
        return maxdiffer;

    }

    public static void main(String[] args) {
        int size = input.nextInt();
        int [] arr = new int[size];

        for(int i = 0 ;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("the max difference between the index i and j " +maxDifferindex(arr, size));
    }

    
}