package com.illa.patterns.strategy.social;

import com.illa.patterns.strategy.SnapchatPublisher;

public class Millenials extends User {

    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }


}
