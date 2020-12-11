package array;
import java.util.Scanner;

public class maxCircularSum
{
    static Scanner input = new Scanner(System.in);
    static int maxcirsum(int arr [] , int size)
    {
        int sumval = 0;
        int currval = 0;
        int maxval;
        for(int  i = 0; i<size;i++){
            sumval += arr[i];
            currval += (i*arr[i]);
        }
        maxval = currval;
        for(int  i = 1 ; i<size;i++){
            currval = (currval+sumval) - (size *arr[size-i]);
            if(currval>maxval){
                maxval = currval;
            }
        }
        return maxval;
        
    }

    public static void main(String[] args) {
        int size = input.nextInt();
        int [] arr = new int [size];
        for(int i = 0 ; i<size;i++){
            arr [i] = input.nextInt();

        }
        System.out.println("the maximum circular value = "+maxcirsum(arr, size));


    }
    
}
