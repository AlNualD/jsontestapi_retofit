package ru.devegang.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);

        System.out.println("111111");
        App.getApi().getData().enqueue(new Callback<IPModel>() {
            @Override
            public void onResponse(Call<IPModel> call, Response<IPModel> response) {
                System.out.println("RESPONSE " + response.body().toString());
            }

            @Override
            public void onFailure(Call<IPModel> call, Throwable t) {
                System.out.println("FAIL RESP");
            }
        });


    }


    public void getIpClick(View view) {
        App.getApi().getData().enqueue(new Callback<IPModel>() {
            @Override
            public void onResponse(Call<IPModel> call, Response<IPModel> response) {
                System.out.println("get Response");
                textView.setText(response.body().getIp());
            }

            @Override
            public void onFailure(Call<IPModel> call, Throwable t) {
                System.out.println("FAIL");

            }
        });
    }

    public void getDateClick(View view) {
        System.out.println("Get date Click");
        App.getApi().getDate().enqueue(new Callback<DateModel>() {
            @Override
            public void onResponse(Call<DateModel> call, Response<DateModel> response) {
                System.out.println("Get Date Response");
                textView2.setText(response.body().getDate());
                textView3.setText(response.body().getTime());
            }

            @Override
            public void onFailure(Call<DateModel> call, Throwable t) {

                System.out.println("FAIL");
            }
        });
    }
}
