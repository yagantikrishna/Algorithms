import java.util.*;
public class ssort {
    public static void selectionSort(int[] arr, int i, int n)
    {
        // find the minimum element in the unsorted subarray `[i…n-1]`
        // and swap it with `arr[i]`
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            // if `arr[j]` is less, then it is the new minimum
            if (arr[j] < arr[min]) {
                min = j;    // update the index of minimum element
            }
        }

        // swap the minimum element in subarray `arr[i…n-1]` with `arr[i]`
        swap(arr, min, i);

        if (i + 1 < n) {
            selectionSort(arr, i + 1, n);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[16000];
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before:");
        ssort s1 = new ssort();
        //s1.printArray(numbers);
        System.out.println("\nAfter:");
        s1.selectionSort(numbers, 0, numbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
