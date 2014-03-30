package com.workshop.main;

import twitter4j.*;
import twitter4j.api.SearchResource;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by Rudie on 23-3-14.
 */
public class MyTwitter {

    private Twitter twitter;

    public MyTwitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("kLXb6JckfEAI48KSI3e0A");
        cb.setOAuthConsumerSecret("Sw8oz6cwB3BKbKz7b5WPjCZHJxGVHMDt8RifllLE");
        cb.setOAuthAccessToken("252181451-QPXbWWwLVeJHtxQLVm4tiNJFzdlJ73PuccTZYzET");
        cb.setOAuthAccessTokenSecret("PqWEORXx1H0RGvyq28tnikwuxEmYx6i66vVM8PlxQlkYc");

        TwitterFactory tf = new TwitterFactory(cb.build());
        this.twitter = tf.getInstance();
    }

    public List<Status> findTweets(String searchString) throws TwitterException {
        Query query = new Query();
        query.setQuery(searchString);
        query.setCount(100);

        SearchResource searchResource = twitter.search();
        QueryResult queryResult = searchResource.search(query);
        return queryResult.getTweets();
    }

    public void saveTweets(List<Status> tweets) {
        Database database = new Database();
        database.connect();
        for (Status tweet : tweets) {
            database.insert("Tweets", "tweet", tweet.getText());
        }
        database.disconnect();
    }
}
