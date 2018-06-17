package com.example.devde.moviestore.RestCall;

import com.example.devde.moviestore.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apikey);

    @GET("movie/id")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String api_key);
}
