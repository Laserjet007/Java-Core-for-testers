package lesson_5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StreamExamples {
    public static void main(String[] args) {
        String tempString = "кот";
        System.out.println((Arrays.toString(tempString.getBytes())));//вывести чистовой код слова кот в консоль

        String tempString1 = "cat";
        System.out.println((Arrays.toString(tempString.getBytes())));//вывести чистовой код слова cat в консоль

        System.out.println(Charset.defaultCharset());//вывести кодировку по умолчанию
        System.out.println(Charset.availableCharsets());// вывести имеющиеся кодировки

        File file = new File("our_example.txt"); // создаем файл

        OutputStream stream = null;//вариант закрытия программы с обычным траем, без библиотек джавы
        try {// обработка исключений
            stream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       /*try (OutputStream stream = new FileOutputStream(file)){// можно в новой версии джавы обьявить поток а затем его и открыть
       } catch (FileNotFoundException e) {//для перекрытия потка необходимо его закрывать так как может подсасывать память или вообще блокернуть файл
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }*/
    }
}
