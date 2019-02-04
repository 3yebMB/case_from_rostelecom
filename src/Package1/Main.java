import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        // по условию, дан массив [0,...,9]
        System.out.println("    Исходный массив: " + Arrays.toString(arr));

        int tmp; // объявляем переменную

        for (int i = 0; i < arr.length/2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        System.out.println("Перевернутый массив: " + Arrays.toString(arr));
    }
}
