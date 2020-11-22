package com.codepath.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6f9jTSthJlitdHFGmAlj0DEJSOhMOdTV3JS7FGeP")
                // if desired
                .clientKey("bTgWgf8fkdDwDGGNttyJWAv9pp9tqfcDwm4TtDo8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
