class selection
{
     public static void printArray(int arr[]) 
    {
       for(int i=0; i<arr.length; i++) 
       {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

    public static void main(String []args)
    {
        int arr[]={2,5,1,7,3};
        
        for(int i=0;i<arr.length-1;i++)
        {
            int index= i;
            for(int j=i+1;j<arr.length;j++)
            {
                 if(arr[j] > arr[index])
                 {
                    index = j;
                 }
            }
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }//for j
         printArray(arr);
    }// for i

}