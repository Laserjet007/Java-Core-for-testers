package lesson_6;

//подключение по url  адрксу

import java.net.MalformedURLException;
import java.net.URL;

public class URLExamples {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://smirnov:password@geekbrains.ru:80/curses?type=qa&level=super#1");// обертка для сокета - класс урл. и в конструктор нужно передать адрес . передать дополнительные параметры можно через знак ? после идет параметр и от если нуно много параметров отделяем амперсантом (#1 -вернуться к началу где читали. якорь) (smirnov:password - вызов аутинтификации)




    }
}
