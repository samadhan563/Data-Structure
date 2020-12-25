
package sortingandsearching;

public class TestArray {

	public static void main(String[] args) 
	{
		int[] arr= {10,30,52,54,48,78,90,2,5,45,8, 110,120,70,9,75,81,45,65,75,85,42,41,5};
		System.out.println("Linear no :48 at loc:: "+SortingAndSearching.linearSearch(arr,85));

		for( int num : arr )
			System.out.print(num+" ");
		System.out.println("\nBinary no :48 at loc:: "+SortingAndSearching.binarySearch(arr,85));
		
		System.out.println("\nFibboneci Search :48 at loc:: "+SortingAndSearching.fibboSearching(arr,777));
	
		
		System.out.println("Heap no working");
		SortingAndSearching.heapSort(arr,0,arr.length-1);
		for( int num : arr )
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("Bubble :: "+SortingAndSearching.bubbleSort(arr));
		for( int num : arr )
			System.out.print(num+" ");
		System.out.println();
		
		System.out.println("Selection sort");
		int[] arr1= {10,30,52,54,48,78,90,2,5,45,8, 110,120,70,9,75,81,45,65,75,85,42,41,5};
		SortingAndSearching.selectionSorting(arr1);
		for( int num : arr1 )
			System.out.print(num+" ");
		
		System.out.println("\nInsertion sort");
		int[] arr2= {10,30,52,54,48,78,90,2,5,45,8, 110,120,70,9,75,81,45,65,75,85,42,41,5};
		SortingAndSearching.insertionSort(arr2);
		for( int num : arr2 )
			System.out.print(num+" ");
		
		System.out.println("\nQuick Sort ");
		int[] arr3= {10,30,52,54,48,78,90,2,5,45,8, 110,120,70,9,75,81,45,65,75,85,42,41,5};
		SortingAndSearching.quickSort(arr3,0,(arr3.length-1));
		for( int num : arr3 )
			System.out.print(num+" ");
	}
}
/* Output::
Linear no :48 at loc:: 20
10 30 52 54 48 78 90 2 5 45 8 110 120 70 9 75 81 45 65 75 85 42 41 5 
Binary no :48 at loc:: -1

Fibboneci Search :48 at loc:: -1111
Heap no working
10 2 5 8 9 41 42 30 52 45 75 54 120 70 48 75 81 45 65 78 85 90 110 5 
Bubble :: 22
2 5 5 8 9 10 30 41 42 45 45 48 52 54 65 70 75 75 78 81 85 90 110 120 
Selection sort
2 5 5 8 9 10 30 41 42 45 45 48 52 54 65 70 75 75 78 81 85 90 110 120 
Insertion sort
2 5 5 8 9 10 30 41 42 45 45 48 52 54 65 70 75 75 78 81 85 90 110 120 
Quick Sort 
2 5 5 8 9 10 30 41 42 45 45 48 52 54 65 70 75 75 78 81 85 90 11
*/
