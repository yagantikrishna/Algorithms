import java.util.*;

class insertion {
    public static void isort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int n = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before:");
        insertion i1 = new insertion();
        i1.printArray(numbers);
        System.out.println("\nAfter:");
        isort(numbers, n);
        i1.printArray(numbers);

    }
}