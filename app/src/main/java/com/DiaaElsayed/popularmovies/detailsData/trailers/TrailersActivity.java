package com.DiaaElsayed.popularmovies.detailsData.trailers;

import android.support.v4.app.Fragment;

import com.DiaaElsayed.popularmovies.BaseActivity;

/**
 * Created by DiaaELsayed on 12/28/15.
 */
public class TrailersActivity extends BaseActivity {
    @Override
    protected Fragment createFragment() {
        return  TrailersFragment.newInstance(getIntent().getIntExtra("extra_movie_id",0));
    }
}
