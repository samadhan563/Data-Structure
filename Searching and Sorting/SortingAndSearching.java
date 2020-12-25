
package sortingandsearching;

public class SortingAndSearching 
{
	public static int linearSearch(int [] arr,int key ) //Linear search
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int key) //Binary Search
	{
		int low=0,high=arr.length-1;
		int mid;
		while(low <= high)
		{
			mid=(high+low)/2;
			if(key==arr[mid])
				return mid;
			else
			{
				if(key<arr[mid])
					high=mid-1;
				else
					low=mid+1;
			}
		}
		return -1;
	}
	
	public static int fibboSearching(int[] arr,int key) //fibonacci Search
	{
		int f1=0,f2=1,f3=0;
		while(f3<arr.length)
		{
			if(key==arr[f1])
				return f1;
			if(( key > arr[f1] ) && ( key < arr [f2] ))
			{
				int [] temp = new int [f2-f1];
				int j=0;
				for (int i = f1; i < f2; i++) 
					temp[j++]=arr[i];
				return f1+binarySearch(temp, key);
				
			}
			f3=f1+f2;
			f1=f2;
			f2=f3;	
		}
		return -1111;	
	}

	public static int bubbleSort(int[] arr) /** bubble sort */
	{		
		for (int i = 0; i < arr.length-1; i++) 
		{
			int count=0;
			for (int j = 0; j < ((arr.length-1)-i); j++) 
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
				return i+1;	
		}
		return arr.length-1;
	}	
	
	public static void selectionSort(int [] arr)
	{
		for (int i = 0; i < (arr.length-1); i++)
		{
			for (int j =1+i; j < arr.length; j++) 
			{
				if(arr[i]<arr[j]);
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		for (int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void selectionSorting(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < arr.length; j++)
			{
				if( arr[j] < arr[min] )
					min=j;
			}
			if( min != i )
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < i; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
   public static void quickSort(int[] arr, int left, int right)
    {
        if(left >= right)
        {
            return;
        }

        int pivotLocation = partition(arr, left, right);
        quickSort(arr, left, pivotLocation -1);
        quickSort(arr, pivotLocation+1, right);
    }

    private static int partition(int [] arr, int left, int right) {
        int pivot = arr[left];

        while(left < right) {
            while(arr[right] > pivot && left < right)
            {
                right--;
            }
            if(left < right) {
                arr[left] = arr[right];
                left++;
            }

            while(arr[left] < pivot && left < right) {
                left++;
            }
            if(left < right) {
                arr[right] = arr[left];
                right--;
            }
        }

        arr[left] = pivot;
        return left;
    }
	
	public static void heapSort( int[] arr,int left, int right)
	{
		if(left>=right)
		{
			return ;
		}
	//while(left < right-1)
	//		{
			for (int i = right-1; i >= left; i--) 
			{
				int parentIndex=(i+1)/2;
				if(arr[i]<arr[parentIndex]) 
				{
					int temp=arr[i];
					arr[i]=arr[parentIndex];
					arr[parentIndex]=temp;
				}
				
			}
		//left++;
//	}
			heapSort(arr,left+1,right-1);
	}
	
}
