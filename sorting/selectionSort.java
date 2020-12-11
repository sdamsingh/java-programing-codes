package sorting;
import java.util.Scanner;

public class selectionSort 
{
    static Scanner input = new Scanner(System.in);
    public static void sorted(int [] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            //swapping  the largest value 
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
        
    

    public static void main(String[] args) {
        
        System.out.println("enter the number of element in array");
        int n =input.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element in the array");

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] =input.nextInt();
            
        }
        System.out.println("the unsorted form of array is ");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(" "+arr[i]);
            
        }
        sorted(arr);
        System.out.println("the sorted for of array is");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(" "+arr[i]);
            
        }
        input.close();


    }
    
}
