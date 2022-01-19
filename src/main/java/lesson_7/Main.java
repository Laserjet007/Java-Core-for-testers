package lesson_7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//пишим клиенскую часть приложения которая обращается к серверу и получает с него данные и их отображать

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
       ObjectMapper objectMapper = new  ObjectMapper();  //класс ObjectMapper позволяет сравнивать данные что есть в джейсоне с тем с чем работаем в джаве

        Car car = new Car("Red", "Porsche");
        String carFromJSON = objectMapper.writeValueAsString(car);  // переделываем обьект кар в джейсон обьект
        System.out.println(carFromJSON);

    }
}
