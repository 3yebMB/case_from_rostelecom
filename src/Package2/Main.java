package Package2;

public class Main {
    public static void main(String[] args) {
        String str = "кот ток рост трос"; // исходное предложение

        System.out.println("В строке " + checkAnagram(str) + " анаграмм.");
    }

    private static int checkAnagram(String s1) {
        int count = 0;

        String[] sArr = s1.split(" ");

        for (int i = 0; i < sArr.length-1; i++) {
            if (sArr[i].length()==sArr[i+1].length()) {
                if (checkEqual(sArr[i].toCharArray(), sArr[i].toCharArray()))
                    count++;
            }
        }
        return count;
    }

    private static boolean checkEqual(char[] a, char[] b) {
        boolean result = false;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
            sum2 += b[i];
        }

        if (sum1==sum2)
            result = true;

        return result;
    }
}
