package Package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static char[] a;
    private static int size;

    public static void main(String[] args) {
        String str = "кот ток рост банан трос отк"; // исходное предложение
        System.out.println("Исходное предложение \"" + str + "\"\n");
        checkAnagram(str);
    }

    private static void checkAnagram(String s1) {
        String[] sArr = s1.split(" ");
        Pattern p = null;
        Matcher m = null;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int anagramcount = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != null) {
                p = Pattern.compile("^[" + sArr[i] + "]{" + sArr[i].length() + "}$");
                sb.append(sArr[i]);
            } else
                continue;
            for (int j = i+1; j < sArr.length; j++) {
                if (sArr[j] == null) continue;
                m = p.matcher(sArr[j]);
                if (m.matches()) {
                    sb.append(", " + sArr[j]);
                    sArr[j] = null;
                    count++; //?
                }
            }
            if (sb.length() > sArr[i].length()) anagramcount++;

            if (count!=0) System.out.println("    [" + sb + "] " + "- анаграмма");

            sb.setLength(0);

            count = 0;
        }

        System.out.println("\nВ предложении " + anagramcount + " анаграмм.");

        }
}

