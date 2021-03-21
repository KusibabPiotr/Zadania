package com.illa.patterns.strategy;

import com.illa.patterns.strategy.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("Only Snapchat!");
        return "Only Snapchat!";
    }
}
