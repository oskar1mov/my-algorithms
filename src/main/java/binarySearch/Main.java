package binarySearch;

import selectionSort.SelectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] myList = {1, 3, 4, 6, 7};

        //BinarySearch
        System.out.println("BinarySearch: ");
        System.out.println(BinarySearch.binarySearch(myList, 3)); //1
        System.out.println(BinarySearch.binarySearch(myList, 7)); //4

        //SelectionSort
        System.out.println("Selection Sort: ");
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 4, 1, 13));
        System.out.println(SelectionSort.selectionSort(arr));
    }
}