package com.illa.patterns.strategy.social;

import com.illa.patterns.strategy.SocialPublisher;

public class User {

    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void changedefaultSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return socialPublisher.share();
    }
}
