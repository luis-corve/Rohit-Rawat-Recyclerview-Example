package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.Movie;
import com.example.recyclerviewexample.MovieViewHolder;
import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private Context context;
    private ArrayList<Movie> movieList;
    public MovieAdapter(Context context, ArrayList<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }
    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_movie, parent, false);
        return new MovieViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.setDirectorName(movie.getDirectorName());
        holder.setMovieName(movie.getName());
        holder.setYear(movie.getYear());
    }
    @Override
    public int getItemCount() {
        return movieList == null ? 0 : movieList.size();
    }
}