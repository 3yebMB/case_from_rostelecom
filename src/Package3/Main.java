package Package3;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {null, 1, 2, null, 7, 1, 2, 1};
        Double[] doubArr = {null, 1.0, 2.0, null, 7.0, 1.0, 2.0};

        System.out.println(intArr);

        intArr = method2(intArr);

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
        boolean rem = false;

        ArrayList<T> al = new ArrayList<>(Arrays.asList(arr2));

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr2[i] == null && arr2[j] == null) rem = true;
                else if (arr2[i].equals(arr2[j])) rem = true;
                else rem = false;
                if (rem) {
                    al.remove(arr2[j]);
                }
            }
            if (rem) { al.remove(arr2[i]); rem = false; }
        }

        System.out.println(al);
        return result;
    }
}
