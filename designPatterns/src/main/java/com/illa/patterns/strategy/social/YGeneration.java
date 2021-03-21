package com.illa.patterns.strategy.social;

import com.illa.patterns.strategy.TwitterPublisher;
import com.illa.patterns.strategy.social.User;

public class YGeneration extends User {

    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
