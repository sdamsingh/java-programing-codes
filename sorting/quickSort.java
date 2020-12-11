package sorting;


public class quickSort
{
    
    public static int partition(int [] arr ,int low , int high)
    {
        int piviot = arr[high];
        int index = low-1;
        for(int j = low ; j<high ; j++)
        {
            if(arr[j] <piviot){
                index++;

                int temp = arr[index];
                arr[index ]  = arr [j];
                arr [ j] = temp ;

            }

        }
        int tempSwap = arr [ index+1];
        arr [ index+1] = arr[high];
        arr[high] = tempSwap;

        return index+1;

    }



    public static void quicksort(int [] arr , int low , int high )
    {
        if(low<high)
        {
            int pi =partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);

        }

    }

 

    public static void main(String[] args) {
        int []  arr = {1,9,3,2,6};
        int lower = 0;
        int upper = arr.length-1;

        quicksort(arr, lower,upper);
        System.out.println("the sorted value of the array using quick sort is ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(" "+arr[i]);
            
        }


    }

    
}
