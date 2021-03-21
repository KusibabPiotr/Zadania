package com.illa.patterns.strategy.social;

import com.illa.patterns.strategy.FacebookPublisher;
import com.illa.patterns.strategy.SnapchatPublisher;
import com.illa.patterns.strategy.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testDefaultSharingStrategies(){
        //given
        Millenials millenials = new Millenials("Mario");
        YGeneration yGeneration = new YGeneration("Monica");
        ZGeneration zGeneration = new ZGeneration("Sopie");
        //when
        String millenialsPost = millenials.sharePost();
        String yGenerationPost = yGeneration.sharePost();
        String zGenerationPost = zGeneration.sharePost();
        //then
        assertThat(millenialsPost).isEqualTo("Only Snapchat!");
        assertThat(yGenerationPost).isEqualTo("Twitter rulez!");
        assertThat(zGenerationPost).isEqualTo("Facebook bitches!");
    }
    @Test
    public void testIndividualSharingStrategy(){
        //given
        Millenials millenials = new Millenials("Mario");
        YGeneration yGeneration = new YGeneration("Monica");
        ZGeneration zGeneration = new ZGeneration("Sopie");
        millenials.changedefaultSocialPublisher(new FacebookPublisher());
        yGeneration.changedefaultSocialPublisher(new SnapchatPublisher());
        zGeneration.changedefaultSocialPublisher(new TwitterPublisher());
        //when
        String millenialsPost = millenials.sharePost();
        String yGenerationPost = yGeneration.sharePost();
        String zGenerationPost = zGeneration.sharePost();
        //then
        assertThat(millenialsPost).isEqualTo("Facebook bitches!");
        assertThat(yGenerationPost).isEqualTo("Only Snapchat!");
        assertThat(zGenerationPost).isEqualTo("Twitter rulez!");
    }

}