package com.DiaaElsayed.popularmovies.detailsData;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.Menu;

import com.DiaaElsayed.popularmovies.BaseActivity;
import com.DiaaElsayed.popularmovies.Movie;
import com.DiaaElsayed.popularmovies.detailsData.reviews.ReviewsActivity;
import com.DiaaElsayed.popularmovies.detailsData.trailers.TrailersActivity;


public class DetailsActivity extends BaseActivity implements DetailsActivityFragment.CallBacks {

    @Override
    protected Fragment createFragment() {
        Intent
intent = getIntent();
        Movie movie = intent.getParcelableExtra("movie");
        return DetailsActivityFragment.newInstance(movie);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public void showReviews(int id) {
        Intent intent = new Intent(this, ReviewsActivity.class);
        intent.putExtra("extra_movie_id", id);
        startActivity(intent);
    }

    @Override
    public void showTrailers(int id) {
        Intent intent = new Intent(this, TrailersActivity.class);
        intent.putExtra("extra_movie_id", id);
        startActivity(intent);
    }

}
