package array;
import java.util.Scanner;

public class maxPathSum 
{
    public static int maxSumPaths(int [] arr1, int size1,int [] arr2,int size2) 
    {
        int i=0;
        int j=0;
        int sum1=0;
        int sum2 = 0;
        int result =0;

        while(i<size1 && j<size2)
        {
            if(arr1[i]<arr2[j]){
                sum1 += arr1[i];
                i+=1;
            }else if(arr2[i]<arr1[j]){
                sum2 += arr2[i];
                j+=1;
            }else{
                result += Math.max(sum1,sum2);
                result=result+arr1[i];
                sum1=0;
                sum2=0;
                i+=1;
                j+=1;
            }

        }
        while(i<size1){
            sum1 +=arr1[i];
            i+=1;
        }
        while(j<size2){
            sum2+=arr2[j];
            j+=1;
        }
        result +=Math.max(sum1, sum2);
        return result;        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int size1 = input.nextInt();
        int size2 = input.nextInt();
        int  [] arr1 = new int [size1];
        int  [] arr2 = new int [size2];

        for(int i = 0 ; i<size1;i++){
            arr1[i] = input.nextInt();
        }
        
        for(int i = 0 ; i<size2;i++){
            arr2[i] = input.nextInt();
        }
        System.out.println("the max sum value of the two array is "+maxSumPaths(arr1, size1, arr2, size2));
        input.close();
    }
    
}
