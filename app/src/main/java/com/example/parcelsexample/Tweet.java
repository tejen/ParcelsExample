package com.example.parcelsexample;

import org.parceler.Parcel;

import java.util.Date;

@Parcel
public class Tweet {
    long id;
    String body;
    String username;
    int numberLikes;
    int numberRetweets;
    Date createdAt;
    /// ...

    public Tweet() {
    }

}
