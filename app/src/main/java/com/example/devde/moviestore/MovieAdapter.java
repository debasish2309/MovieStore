package com.example.devde.moviestore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    ArrayList<Movie> movies = new ArrayList<Movie>();
    Context context;

    public MovieAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,parent,false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(view);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.title.setText(movie.getOriginal_title());
        holder.description.setText(movie.getStatus());

        String poster = "https://image.tmdb.org/t/p/w500" + movie.getPoster_path();
        Glide.with(context).load(poster).into(holder.movie_image);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView movie_image;
        TextView title,description;

        public MovieViewHolder(View itemView) {
            super(itemView);
            movie_image = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.textview);
            description = itemView.findViewById(R.id.textview1);
        }
    }
}