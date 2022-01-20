package lesson_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//пишим клиенскую часть приложения которая обращается к серверу и получает с него данные и их отображать

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
       ObjectMapper objectMapper = new  ObjectMapper();  //класс ObjectMapper позволяет сравнивать данные что есть в джейсоне с тем с чем работаем в джаве
// переделываем обьект кар в джейсон обьект c помощью objectMapper
        Car car = new Car("Red", "Porsche");
        String carFromJSON = objectMapper.writeValueAsString(car);
        System.out.println(carFromJSON);

//проделать перидущую операцию и собрать обьект из джейсона
        Car car1 = objectMapper.readValue(carFromJSON, Car.class);
        System.out.println(car1); //из за реализации ту стринг из маин - пишим просто кар1

       // ВАРИАНТ НЕ СО СТРОКОЙ КАК В ПРЕДИДУЩЕМ ВАРИАНТЕ - А С СПИСКОМ (вариант посложнее)


    }
}
