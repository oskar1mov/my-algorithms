package selectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//O(n^2)
public class SelectionSort {
    public static List<Integer> selectionSort(List<Integer> arr) {
         /*the newArr variable stores the new sorted list
        while the original list is gradually emptied*/
        List<Integer> newArr = new ArrayList<>(arr.size());
        int size = arr.size();
        for (int i=0; i<size; i++) {
            int smallest = findSmallest(arr); //find the smallest element
            newArr.add(arr.get(smallest)); //add it to the new array
            arr.remove(smallest); //remove it from the original array
        }
        return newArr;
    }
    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0); //assume first element is smallest
        int smallestIndex = 0; //keep track of the index of the smallest value
        for (int i=1; i<arr.size(); i++) { //iterate through the rest of the array
            if (arr.get(i) < smallest) { //if we find a smaller value
                smallest = arr.get(i); //update the smallest value
                smallestIndex = i; //update the index of the smallest value
            }
        }
        return smallestIndex; //return the index of the smallest element
    }
}
