package lesson_6;

import java.net.URL;

public class URLConnectionExamples {
    public static void main(String[] args) {//открываем точку входа
        URL url = new URL("https", "gb.ru", "/" );//адрес к которому обращаемся и вариант конструктора в три строки. / - обращение к корню сайта
    }
}
