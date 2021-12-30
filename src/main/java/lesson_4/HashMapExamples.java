package lesson_4;

import java.util.HashMap;

public class HashMapExamples {  //HashMap коллекция хранит пары значения (ключь и хеш)
    public static void main(String[] args) {
       /* HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "One");
        System.out.println(hashMap);
        hashMap.put("2", "two");
        System.out.println(hashMap);
        hashMap.put("1", "two");
        System.out.println(hashMap);*///при добалении элемента идет поиск по ключу ( при найденном совпадении ключь меняется)


        HashMap<Integer, String> passports = new HashMap<>();
        passports.put(1234, "qqqqq");
        passports.put(2344, "uuuuu");
        passports.put(11234, "iuiii");
        passports.put(12134, "ppppp");

        System.out.println(passports);

    }

}
