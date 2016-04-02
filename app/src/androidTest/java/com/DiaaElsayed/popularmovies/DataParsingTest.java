package com.DiaaElsayed.popularmovies;

import android.test.AndroidTestCase;

import com.DiaaElsayed.popularmovies.connection.ParseData;

/**
 * Project: Popular Movies
 * Created by muhammad on 26/06/15.
 */
public class DataParsingTest extends AndroidTestCase {

    ParseData parser;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        parser = new ParseData(getContext().getString(R.string.server_example_payload));
    }

    public void testCanRetrievePageNumber() throws Exception {
        int pageNumber = parser.getCurrentPageNumber();
        assertEquals("Page number", 1, pageNumber);
    }

    public void testCanRetrieveTotalPages() throws Exception {
        int pageNumber = parser.getTotalNumberOfPages();
        assertEquals("Total number of pages", 11584, pageNumber);
    }

    public void testCanRetrieveTotalResults() throws Exception {
        int pageNumber = parser.getTotalNumberOfResults();
        assertEquals("total number of results", 231676, pageNumber);
    }

    public void testCheckSizeOfRetrievedResults() throws Exception {
        int pageNumber = parser.getNumberOfResultsInCurrentPage();
        assertEquals("Number of results per page", 20, pageNumber);
    }

    public void testRetrievalOfFirstMovieData() throws Exception {
        assertEquals("Original Title", "Jurassic World", parser.getMovie(0).getOriginalTitle());
        assertEquals("Poster path", "http://image.tmdb.org/t/p/w185/uXZYawqUsChGSj54wcuBtEdUJbh.jpg", parser.getMovie(0).getPosterUrl());
        assertEquals("Plot synopsis", "Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.", parser.getMovie(0).getPlotSynopsis());
        assertEquals("User Rating", 7d, parser.getMovie(0).getUserRating());
        assertEquals("Release Date", "2015-06-12", parser.getMovie(0).getReleaseDate());
    }

}
