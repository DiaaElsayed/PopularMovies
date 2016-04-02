package com.DiaaElsayed.popularmovies;

import android.test.AndroidTestCase;

import com.DiaaElsayed.popularmovies.connection.connectingServer;

/**
 * Project: Popular Movies
 * Created by muhammad on 25/06/15.
 */
public class ServerConnectionTest extends AndroidTestCase {

    //TODO: Create a test to test exception thrown when unauthorized (previously was tested by a removed stepping stone test

    public void testRetrievingMoviesDataFromServerReturnsResult() throws Exception {
        connectingServer connector = new connectingServer(getContext());
        assertNotSame("Data retrieved is not empty", 0, connector.getData().length());
    }

}
