package binarySearch;

//O(log n)
public class BinarySearch {
    public static Integer binarySearch(int[] list, int item) {
        /*the variables 'low' and 'high' store the boundaries of the part of the
        list in which the search is performed*/
        int low = 0;
        int high = list.length - 1;

        while (low <= high) { //until this part is reduced to one element...
            int mid = (low + high) / 2; //...we check the middle element
            int guess = list[mid];
            if (guess == item) { //if value found
                return mid;
            }
            if (guess > item){ //high
                high = mid - 1;
            } else { //low
                low = mid + 1;
            }
        }
        return null; //the value does not exist :(
    }
}
