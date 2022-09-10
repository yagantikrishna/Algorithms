import java.util.*;

public class ssort {
    public void sort(int[] arr, ArrayList<Integer> ds, int index) {
        if (arr.length == 1) {
            System.out.println(ds);
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[index];
            if (arr[i] < min) {
                min = arr[i];
            }
            index = i;
        }
        swap(arr, 0, index);
        ds.add(arr[0]);
        for (int j = 1; j < arr.length; j++) {
            arr[j - 1] = arr[j];
        }
        sort(arr, ds, 0);
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
        ssort s1 = new ssort();
        s1.printArray(numbers);
        System.out.println("\nAfter:");
        s1.sort(numbers, ds, 0);
        s1.printArray(numbers);

    }
}
