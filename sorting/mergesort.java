import java.util.*;

public class mergesort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        msort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void msort(int[] numbers) {
        int n = numbers.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            leftHalf[i] = numbers[i];
        }
        for (int i = mid; i < n; i++) {
            rightHalf[i - mid] = numbers[i];
        }
        msort(leftHalf);
        msort(rightHalf);
        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        int l = leftHalf.length;
        int r = rightHalf.length;
        while (i < l && j < r) {
            if (leftHalf[i] < rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < r) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}