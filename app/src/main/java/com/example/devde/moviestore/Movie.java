package com.example.devde.moviestore;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("poster_path")
    private Integer poster_path;
    @SerializedName("original_title")
    private String original_title;
    @SerializedName("original_language")
    private String original_language;
    @SerializedName("overview")
    private String overview;
    @SerializedName("backdrop_path")
    private Integer backdrop_path;
    @SerializedName("budget")
    private Integer budget;
    @SerializedName("popularity")
    private  Double popularity;
    @SerializedName("release_date")
    private Integer release_date;
    @SerializedName("revenue")
    private Integer revenue;
    @SerializedName("status")
    private String status;
    @SerializedName("runtime")
    private Integer runtime;
    @SerializedName("vote_average")
    private Double vote_average;
    @SerializedName("vote_count")
    private Integer vote_count;

    public Movie(Integer poster_path, String original_title, String original_language, String overview, Integer backdrop_path, Integer budget, Double popularity, Integer release_date, Integer revenue, String status, Integer runtime, Double vote_average, Integer vote_count) {
        this.poster_path = poster_path;
        this.original_title = original_title;
        this.original_language = original_language;
        this.overview = overview;
        this.backdrop_path = backdrop_path;
        this.budget = budget;
        this.popularity = popularity;
        this.release_date = release_date;
        this.revenue = revenue;
        this.status = status;
        this.runtime = runtime;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
    }

    public Integer getPoster_path() {
        return poster_path;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOverview() {
        return overview;
    }

    public Integer getBackdrop_path() {
        return backdrop_path;
    }

    public Integer getBudget() {
        return budget;
    }

    public Double getPopularity() {
        return popularity;
    }

    public Integer getRelease_date() {
        return release_date;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public String getStatus() {
        return status;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Double getVote_average() {
        return vote_average;
    }

    public Integer getVote_count() {
        return vote_count;
    }
}
