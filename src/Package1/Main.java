package Package1;

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

        for (int i = 0; i < arr.length/2; i++) { // идём до середиты, т.к. при каждом проходе, местами меняются 2 эл.
            tmp = arr[i];                        // получаем за 5 итераций цикла, развернули массив.
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        System.out.println("Перевернутый массив: " + Arrays.toString(arr));
    }
}
























//        Исходный массив: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//        Перевернутый массив: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]