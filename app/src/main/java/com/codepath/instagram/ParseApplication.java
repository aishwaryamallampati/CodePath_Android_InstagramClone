package com.codepath.instagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6f9jTSthJlitdHFGmAlj0DEJSOhMOdTV3JS7FGeP")
                // if desired
                .clientKey("bTgWgf8fkdDwDGGNttyJWAv9pp9tqfcDwm4TtDo8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
