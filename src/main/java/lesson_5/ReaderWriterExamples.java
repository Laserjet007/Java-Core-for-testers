package lesson_5;

//символьные потоки

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReaderWriterExamples {
    public static void main(String[] args) {     //точка входа
        try {InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), StandardCharsets.UTF_8);//поточный , но заврнутый в символьную обработку (в ковычки передаем поток new FileInputStream)/ можно еще и указать кодировку
            int x;//читать в цыкле каждый символ
            while ((x = inputStreamReader.read()) != -1); {//считывается новый символ и присваивается х... читать до - 1 означает коннец файла
                System.out.println(x);//выводим символ в консоль
                System.out.println((char) x);//преобразовываем в букву
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
