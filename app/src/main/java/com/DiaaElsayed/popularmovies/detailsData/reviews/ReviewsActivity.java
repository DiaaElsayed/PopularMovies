package com.DiaaElsayed.popularmovies.detailsData.reviews;

import android.support.v4.app.Fragment;

import com.DiaaElsayed.popularmovies.BaseActivity;

/**
 * Created by DiaaELsayed on 12/28/15.
 *
 */
public class ReviewsActivity extends BaseActivity {
    @Override
    protected Fragment createFragment() {
        return  ReviewsFragment.newInstance(getIntent().getIntExtra("extra_movie_id",0));
    }
}
