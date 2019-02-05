package Package3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {null, 1, 2, null, 7, 1, 2, 1};
        Double[] doubArr = {null, 1.0, 2.0, null, 7.0, 1.0, 2.0};

        System.out.println(intArr);

//        intArr = method1(intArr);

        System.out.println("" + Arrays.toString(intArr));
//        System.out.println("" + intArr.toString());
    }

    private static <T> T[] method1(T[] arr1) {
        T[] result = null;
        T[] tmpArr = null;
        for (int i = 0; i < arr1.length-1 ; i++) {
            if (arr1[i].equals(arr1[i+1])) {
                System.arraycopy(arr1, i, tmpArr, 0, tmpArr.length);
            }
            System.arraycopy(tmpArr, 0, result, result.length-1, result.length);
        }
        return result;
    }

    private static <T> T[] method2(T[] arr2) {
        T[] result = null;

        return result;
    }
}
