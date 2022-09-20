import java.util.*;

class binarysearch {
    static ArrayList binsearch(int[] arr, ArrayList<Integer> ds, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                ds.add(mid);
            } else if (arr[mid] > x) {
                binsearch(arr, ds, l, mid - 1, x);
            } else if (arr[mid] < x) {
                binsearch(arr, ds, mid + 1, r, x);
            } else {
                System.out.println("element is not present");
            }

        }
        return ds;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 1, 3, 6, 1 };
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        result = binsearch(arr, ds, 0, arr.length - 1, 6);
        System.out.println("The first occurence is at index: " + result.get(0));
        System.out.println("The last occurence is at index: " + result.get(result.size() - 1));
    }
}