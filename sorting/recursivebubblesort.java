import java.util.*;

public class recursivebubblesort {
    public static void bsort(int[] num, int i, int n) {
        if (i >= n - 2) {
            return;
        }
        for (int j = 0; j < n - i - 1; j++) {
            if (num[j + 1] < num[j]) {
                swap(num, j + 1, j);
            }
        }
        bsort(num, i + 1, n);
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
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        int n = numbers.length;

        System.out.println("Before:");
        recursivebubblesort b1 = new recursivebubblesort();
        b1.printArray(numbers);
        System.out.println("\nAfter:");
        bsort(numbers, 0, n);
        b1.printArray(numbers);

    }
}