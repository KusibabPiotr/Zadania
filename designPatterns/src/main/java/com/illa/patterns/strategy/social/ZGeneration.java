package com.illa.patterns.strategy.social;

import com.illa.patterns.strategy.FacebookPublisher;

public class ZGeneration extends User {

    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
