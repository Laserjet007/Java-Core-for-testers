package lesson_4;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(100);
        integerArrayList.add(123);
        integerArrayList.add(456);
        integerArrayList.add(789);
        integerArrayList.add(123);

        System.out.println(integerArrayList);

        integerArrayList.remove(Integer.valueOf(123));   //удалить первый найденный 123 элимент из массива ( коллкции)
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        integerArrayList.set(1, 999);     //set - подменяет ячейку
        System.out.println(integerArrayList);

        integerArrayList.add(1, 888);     //add удаляет элементы
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.contains(new Integer(888)));  //поиск по элементу

    }
}
