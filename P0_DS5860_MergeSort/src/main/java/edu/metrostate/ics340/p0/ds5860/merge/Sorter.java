package edu.metrostate.ics340.p0.ds5860.merge;
import java.util.Arrays;
/**
* <h2>MergeSort</h2>
* The MergeSort program takes an array of type T and uses the merge sort algorithm to sort it.
* 
* @author  Dylan Skokan
* @since   1/20/22
* 
* <p>Sources used:</p>
* - Abhinaya. (2018). How to divide an array into half in java? How to divide an array into half in Java? Retrieved January 18, 2022, from https://www.tutorialspoint.com/How-to-divide-an-array-into-half-in-java#:~:text=Using%20the%20copyOfRange()%20method,2%20to%20length%20to%20other.
* <br>
* - Compare two strings in Java. GeeksforGeeks. (2020, March 29). Retrieved January 18, 2022, from https://www.geeksforgeeks.org/compare-two-strings-in-java/ 
*/
public class Sorter {
	private static <T extends Comparable<T>> void merge(T [] items, T [] leftHalf, T [] rightHalf) {
		int leftLength = leftHalf.length, rightLength = rightHalf.length;
		int i = 0, j = 0, k = 0;

		while(i < leftLength && j < rightLength){
			items[k++] = (leftHalf[i].compareTo(rightHalf[j]) <= 0) ? leftHalf[i++] : rightHalf[j++];
		}
		
		while(i < leftLength) {
			items[k++] = leftHalf[i++];
		}
		while(j < rightLength) {
			items[k++] = rightHalf[j++];
		}
	}

	/**
	* The sort method accepts an array of type T to be merge sorted. To do this, the sort method recursively calls 
	* itself to split up the array, after splitting up the array the sort method calls merge which sorts and adds 
	* the elements back into the original array.
	* 
    * @param items The array of type T to be merge sorted by the program.
	*/
	public static <T extends Comparable<T>> void sort (T [] items) {
		int itemsLength = items.length;
		if(itemsLength > 1) {
			int midIndex = itemsLength / 2;
			
			T [] leftHalf = Arrays.copyOfRange(items, 0, midIndex);
			T [] rightHalf = Arrays.copyOfRange(items, midIndex, itemsLength);
			
			sort(leftHalf);
			sort(rightHalf);
			
			merge(items, leftHalf, rightHalf);
		}
	}
}