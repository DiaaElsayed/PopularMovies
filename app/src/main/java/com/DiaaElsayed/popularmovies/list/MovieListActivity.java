package com.DiaaElsayed.popularmovies.list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.DiaaElsayed.popularmovies.BaseActivity;
import com.DiaaElsayed.popularmovies.R;
import com.DiaaElsayed.popularmovies.detailsData.DetailsActivityFragment;
import com.DiaaElsayed.popularmovies.detailsData.reviews.ReviewsFragment;
import com.DiaaElsayed.popularmovies.detailsData.trailers.TrailersFragment;

public class MovieListActivity extends BaseActivity implements DetailsActivityFragment.CallBacks {


    @Override
    protected Fragment createFragment() {


        return new MovieListFragment();
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_movies_list;
    }

    @Override
    public void showReviews(int id) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_details, ReviewsFragment.newInstance(id)).addToBackStack(null).commit();
    }

    @Override
    public void showTrailers(int id) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_details, TrailersFragment.newInstance(id)).addToBackStack(null).commit();
    }
}
