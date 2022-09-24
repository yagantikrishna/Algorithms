import java.util.*;

public class bubblesort {
    public static void bsort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j + 1] < num[j]) {
                    swap(num, j + 1, j);
                }
            }
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
        int[] numbers = new int[10];
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before:");
        bubblesort b1 = new bubblesort();
        b1.printArray(numbers);
        System.out.println("\nAfter:");
        bsort(numbers);
        b1.printArray(numbers);

    }
}