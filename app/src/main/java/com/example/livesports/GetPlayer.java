package com.example.livesports;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetPlayer {
@GET("teams/{id}")
    Call<TeamClass>getTeamData(@Path("id") int id, @Query("api_token")  String token);

    @GET("players")

    Call<PlayerArray> getPlayerData(@Query("api_token") String token
            , @Query("country_id") int cid
    );
}
