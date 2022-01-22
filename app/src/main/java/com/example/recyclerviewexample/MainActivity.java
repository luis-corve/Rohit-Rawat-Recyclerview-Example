package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.MovieAdapter;
import com.example.recyclerviewexample.Movie;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Movie> movieList;
    private RecyclerView rvMovies;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        generateData();
        setData();
    }
    private void init() {
         movieList = new ArrayList<>();
         rvMovies = findViewById(R.id.rv_movies);
    }
    private void generateData() {
         movieList.add(new Movie("Inception", "Christopher Nolan", "2010"));
         movieList.add(new Movie("The Social Network", "David Fincher", "2010"));
         movieList.add(new Movie("Mad Max: Fury Road", "George Miller", "2015"));
         movieList.add(new Movie("12 Years a Slave", "Steve McQueen", "2013"));
         movieList.add(new Movie("Whiplash", "Damien Chazelle", "2014"));
         movieList.add(new Movie("Prisoners", "Denis Villeneuve", "2013"));
         movieList.add(new Movie("Arrival", "Denis Villeneuve", "2016"));
         movieList.add(new Movie("Django Unchained", "Quentin Tarantino", "2012"));
    }
    private void setData() {
         rvMovies.setLayoutManager(new LinearLayoutManager(this));
         rvMovies.setAdapter(new MovieAdapter(this, movieList));
    }
}