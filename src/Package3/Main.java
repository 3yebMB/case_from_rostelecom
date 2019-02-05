package Package3;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] intArr = {null, 1, 2, null, 7, 1, 2};

        System.out.println("Исходный массив : " + Arrays.toString(intArr));

        intArr = method2(intArr);

        System.out.println("Массив без повторяющиъся элементов : " + Arrays.toString(intArr));
    }

    private static Object[] method1(Object[] arr1) {
        Object[] result = null;
        Object[] tmpArr = null;
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
        boolean isNull = false;
        ArrayList<T> al = new ArrayList<>(Arrays.asList(arr2));
        int lenArr = 0;

        for (int i = 0; i < arr2.length; i++) {
            lenArr = al.size();
            if ((arr2[i] == null)) isNull = true;
            else isNull = false;

            for (int j = i+1; j < arr2.length; j++) {
                if (isNull) {
                    if (arr2[j] == null) {
                        al.remove(j);
                    }
                } else {
                    if (arr2[i].equals(arr2[j]))
                        al.remove(arr2[j]);
                }
            }
            if (lenArr != al.size()) al.remove(arr2[i]);
        }

        result = (T[]) al.toArray();
        return result;

    }
}
