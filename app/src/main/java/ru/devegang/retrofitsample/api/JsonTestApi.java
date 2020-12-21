package ru.devegang.retrofitsample.api;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.devegang.retrofitsample.DateModel;
import ru.devegang.retrofitsample.IPModel;

/**
 * Created by misha on 31.10.2016.
 */
public interface JsonTestApi {

   // @GET("/api/get")
   // Call<List<PostModel>> getData(@Query ("site") String siteName, @Query("name") String resourceName, @Query("num") int count);

    @GET("/?service=ip")
    Call<IPModel> getData();

    @GET("/?service=date")
    Call<DateModel> getDate();
}
