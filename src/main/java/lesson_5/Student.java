package lesson_5;

//пример как прать, читать параметры обьекта

public class Student {
    private  String nameOfStudent;
    private  String surname;
    private  String age;

    public Student(String nameOfStudent, String surname, String age) {// конструктор
        this.nameOfStudent = nameOfStudent;
        this.surname = surname;
        this.age = age;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
