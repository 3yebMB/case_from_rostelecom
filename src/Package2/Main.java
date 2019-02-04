package Package2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static char[] a;
    private static int size;

    public static void main(String[] args) {
        String str = "кот ток рост трос отк кот"; // исходное предложение
        System.out.println("В строке " + checkAnagram(str) + " анаграмм.");
    }

    // по идее, такой большой код, я бы вывел в отдельный класс

    private static int checkAnagram(String s1) {
        int result = 0;

        Map map = new HashMap<String, Integer>();

        String[] sArr = s1.split(" ");

        List<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < sArr.length; i++) {
            char[] ch = sArr[i].toCharArray();

            Stream<Character> myStreamOfCharacters = IntStream
                    .range(0, ch.length)
                    .mapToObj(ii -> ch[ii]);

            List<Character> list = myStreamOfCharacters.collect(Collectors.toList());
            Set<Character> set = new TreeSet<>(list);

            String s3 = set.stream().map(String::valueOf).collect(Collectors.joining());
            arrayList.add(s3);
        }

        HashMap<String, Integer> hm = new HashMap<String , Integer>();
        Integer am;
        for (String i : arrayList) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }
        System.out.println(hm);
        return result;
    }
}
