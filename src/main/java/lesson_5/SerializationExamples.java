package lesson_5;

//вариант передачи обьекта ссылочного типа ( не строка или буквы ) или вариант передачи обьекта джавы что бы он лежал на выходе для работы с ним

import java.io.*;

public class SerializationExamples {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("student");//открываем файт в который будем сериализовывать

        Student student = new Student("Anton", "Gangonov", 45);
        Student student1 = new Student("Ivan", "Heronov", 76);
        Student student2 = new Student("Semen", "Rudicov", 98);
        Student student3 = new Student("Drtg", "Dthhyjj", 45);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {; //записываем обьекты-студенты в файл (можно также по сети передать
            objectOutputStream.writeObject(student);//вызываем целиком обьект
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
