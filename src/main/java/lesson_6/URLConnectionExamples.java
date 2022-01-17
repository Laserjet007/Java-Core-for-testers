package lesson_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLConnectionExamples {
    public static void main(String[] args) throws IOException {//открываем точку входа
        URL url = new URL("https", "gb.ru", "/" );//адрес к которому обращаемся и вариант конструктора в три строки. / - обращение к корню сайта

        InputStream in = url.openStream();//настроить поток от клиента к гб серверу
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));//построчно считываем буфером и выводим код страницы гб

        String line;
        while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
    }
         bufferedReader.close();//закрываем поток что бы не делать трай кетч

    //еще один пример на примере бронировани отеля: передаем параметры в теле запроса
        URL url1 = new URL("https://restful-booker.herokuapp.com/auth");//зтот сервис требует работы в аштиэмэль запросе
     HttpURLConnection// в теле запроса передаем джейсон с аутивеникацией. соединение с помощью аштитипи запроса



    }
}