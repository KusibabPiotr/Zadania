package com.illa.patterns.strategy;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        System.out.println("Facebook bitches!");
        return "Facebook bitches!";
    }
}
