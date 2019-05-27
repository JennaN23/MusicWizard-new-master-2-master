package com.hfad.musicwizard;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MusixMatchService {
    @GET("search.json")
    Call<MusixMatchResponse> searchMusixMatch(
            @Query("a") String Artist,
            @Query("t") String Track,
            @Query("restrict_sr") int restrict);

}