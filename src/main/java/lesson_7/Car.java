package lesson_7; //обьекты превращаем в джесон что бы превращать затем их в обьектики

public class Car {   //задаем цвет и тип
    private String color;
    private String type;

    public Car(String color, String type) { //делаем конструктор
        this.color = color;
        this.type = type;
    }

    public String getColor() {// геторы и сеторы
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
