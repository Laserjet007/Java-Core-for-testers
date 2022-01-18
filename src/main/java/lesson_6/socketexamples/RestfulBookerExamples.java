package lesson_6.socketexamples;

import okhttp3.*;

import java.io.IOException;

public class RestfulBookerExamples {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl httpUrl = new HttpUrl.Builder()        //строим урл к букеру
                .scheme("https")              //протокол называется схема
                .host("restful-booker.herokuapp.com")
                .addPathSegment("auth")    //сигмент пути ( как в предидущих соединениях / или патч)
                .build();

        String authBody = "{\n" +               //формируем тело запроса  вориате  json (пары : члюч:значение экранируем под джава \n  \) и передаем его
                "  \"username\":\"admin\",\n" +
                "  \"password\":\"password123\"\n" +
                "   }";

        RequestBody requestBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request request = new Request.Builder()
                .url(httpUrl)
                .addHeader("Content-Type", "application/json")
                .post(requestBody)
                .build();

       Response responseAuth = okHttpClient.newCall(request).execute();

       System.out.println(responseAuth.isSuccessful());

       String responseWithToken = responseAuth.body().string();

        System.out.println(responseWithToken);

        String token = responseWithToken.split(":")[1];    // метод сплит возвращает массив и делит на кусочки токен : пароль... берем первый [1]
       // token = token.replace("\"", "");//избавляемся от кавычки
       // token = token.replace("}", "");   // избавляемся от закрывающей точки

        token = token.replaceAll()//предидущие выдергивание по символам можно  обработать регулярным выражением

        System.out.println(token);
    }
}
