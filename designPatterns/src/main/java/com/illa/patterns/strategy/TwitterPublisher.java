package com.illa.patterns.strategy;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String share() {
        System.out.println("Twitter rulez!");
        return "Twitter rulez!";
    }
}
