import java.util.*;

public class binarysearch2 {
    static int binsearch2(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (r > l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 1, 3, 6, 1 };
        int target = 5;
        int index = binsearch2(arr, target);
        if (index != -1) {
            System.out.println("he first occurence is at index: " + index);
        } else {
            System.out.println("The element is not present");
        }
    }
}