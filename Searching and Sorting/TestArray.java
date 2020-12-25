package sortingandsearching;

public class TestArray {

	public static void main(String[] args) 
	{
		int[] arr= {10,30,52,54,48,78,90,2,5,45,8, 110,120,70,9,75,81,45,65,75,85,42,41,5};
		/*System.out.println("Linear no :48 at loc:: "+SortingAndSearching.linearSearch(arr,85));
		System.out.println("Bubble :: "+SortingAndSearching.bubbleSort(arr));
		for( int num : arr )
			System.out.print(num+" ");
		System.out.println("\nBinary no :48 at loc:: "+SortingAndSearching.binarySearch(arr,85));
		System.out.println("\nFibboneci Search :48 at loc:: "+SortingAndSearching.fibboSearching(arr,777));
	
		*/
		
		System.out.println();
		SortingAndSearching.heapSort(arr,0,arr.length-1);
		for( int num : arr )
			System.out.print(num+" ");
		System.out.println();
		
		
		
		System.out.println();
		SortingAndSearching.selectionSorting(arr);
		for( int num : arr )
			System.out.print(num+" ");
		System.out.println();
		SortingAndSearching.insertionSort(arr);
		for( int num : arr )
			System.out.print(num+" ");
		SortingAndSearching.quickSort(arr,0,(arr.length-1));
		for( int num : arr )
			System.out.print(num+" ");
	}

}
