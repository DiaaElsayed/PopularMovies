package com.DiaaElsayed.popularmovies;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by diaa on 06/01/2016.
 */
public abstract class MoviesDatabase extends SQLiteOpenHelper {
    public MoviesDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}
