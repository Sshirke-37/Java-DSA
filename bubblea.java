//Ascending Bubble Sort
class bSort
{

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.err.println(arr[i]+" ");
        }
        System.err.println(" ");
    }
    public static void main(String args[])
    {
        int arr[] = {10, 5, 3, 1 , 6};
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int  j = 0 ; j < arr.length-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }//if
            }//jloop
        }//iloop
        printArray(arr);
    }
}