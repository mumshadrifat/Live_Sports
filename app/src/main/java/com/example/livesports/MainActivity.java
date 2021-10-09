package com.example.livesports;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    GetPlayer getPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit
                .Builder()
                .baseUrl("https://cricket.sportmonks.com/api/v2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

         getPlayer=retrofit.create(GetPlayer.class);

        Call<TeamClass>call_1=getPlayer.getTeamData(10,"0pxcdEQdsGZ7DGBUQNstGwcNmdA0pPuZ9vTimkIP1zbwefRZGiS9MtFMZbW9");
        call_1.enqueue(new Callback<TeamClass>() {
            @Override
            public void onResponse(Call<TeamClass> call, Response<TeamClass> response) {
              final  int  cid= response.body().getCountry_id();
              String s_cid=String.valueOf(cid);
                Log.d("checking",s_cid);
               Call<PlayerArray>call_2=getPlayer.getPlayerData("0pxcdEQdsGZ7DGBUQNstGwcNmdA0pPuZ9vTimkIP1zbwefRZGiS9MtFMZbW9",190324);

//PLayer list
               call_2.enqueue(new Callback<PlayerArray>() {
                   @Override
                   public void onResponse(Call<PlayerArray> call, Response<PlayerArray> response) {
                       Log.d("checking","loading player data");
                   }

                   @Override
                   public void onFailure(Call<PlayerArray> call, Throwable t) {
                       Log.d("checking","Failed");


                   }
               });
             /*  call_2.enqueue(new Callback<PlayerArray>() {
                   @Override
                   public void onResponse(Call<PlayerArray> call, Response<PlayerArray> response) {
                       Log.d("checking","loading player data");

                       List<PlayerCLasss> list=response.body().getData();
                       Log.d("checking","Loaded");
                       for(int i=0;i<list.size();i++){
                           PlayerCLasss pl=list.get(i);
                           Log.d("checking",pl.getFullname());
                           Log.d("checking",pl.getPosition().getName());

                       }
                   }

                   @Override
                   public void onFailure(Call<PlayerArray> call, Throwable t) {
        Log.d("g","failed:");
                   }
               });*/


            }

            @Override
            public void onFailure(Call<TeamClass> call, Throwable t) {

            }
        });

    }
}