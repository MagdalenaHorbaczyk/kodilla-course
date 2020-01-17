package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam");
        User monique = new YGeneration("Monique");
        User george = new ZGeneration("George");

        //When
        String adamShouldUse = adam.sharePost();
        System.out.println("Adam likes: " + adamShouldUse);
        String moniqueShouldUse = monique.sharePost();
        System.out.println("Monique likes: " + moniqueShouldUse);
        String georgeShouldUse = george.sharePost();
        System.out.println("George likes: " + georgeShouldUse);

        //Then
        Assert.assertEquals("[TwitterPublisher] Twitter", adamShouldUse);
        Assert.assertEquals("[FacebookPublisher] Facebook", moniqueShouldUse);
        Assert.assertEquals("[SnapchatPublisher] Snapchat", georgeShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam");

        //When
        String adamShouldUse = adam.sharePost();
        System.out.println("Adam likes: " + adamShouldUse);
        adam.setSocialPublisher(new SnapchatPublisher());
        adamShouldUse = adam.sharePost();
        System.out.println("Adam now likes: " + adamShouldUse);

        //Then
        Assert.assertEquals("[SnapchatPublisher] Snapchat", adamShouldUse);
    }
}
