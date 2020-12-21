package ru.devegang.retrofitsample;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.devegang.retrofitsample.api.JsonTestApi;

/**
 * Created by misha on 31.10.2016.
 */

public class App extends Application {

    private static JsonTestApi jsonTestApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                    .baseUrl("http://date.jsontest.com/")//("http://umorili.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        jsonTestApi = retrofit.create(JsonTestApi.class);
    }

    public static JsonTestApi getApi() {
        return jsonTestApi;
    }
}
