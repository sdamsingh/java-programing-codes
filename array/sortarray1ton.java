package array;
import java.util.Scanner;

public class sortarray1ton 
{
    static Scanner input = new Scanner(System.in);
    public static void sort1toN(int arr[] ,int n){
        int temp;
        for(int i=0;i<n;i++)
        {
            while(arr[i]!=i+1 && arr[i]>1)
            {
                temp=arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;

            }
        }

    }
    public static void main(String[] args) {
        int n=input.nextInt();
        int arr[] =new int[n];

        for(int i=0;i<n;i++){
            arr[i] =input.nextInt();
        }
        sort1toN(arr,n);
        for(int i = 0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

        
    }
    
}
