package lesson_5;

//символьные потоки

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReaderWriterExamples {
    public static void main(String[] args) throws FileNotFoundException {     //точка входа
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("1.txt"), StandardCharsets.UTF_8);//поточный , но заврнутый в символьную обработку (в ковычки передаем поток new FileInputStream)/ можно еще и указать кодировку
            int x;//читать в цыкле каждый символ
            while ((x = inputStreamReader.read()) != -1) ;
            {//считывается новый символ и присваивается х... читать до - 1 означает коннец файла
                System.out.println(x);//выводим символ в консоль
                System.out.println((char) x);//преобразовываем в букву
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // пример чтения и записи через буфер целиком построчно

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"))) {
            System.out.println(bufferedReader.readLine()); //прочитать строчку и вывести

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}