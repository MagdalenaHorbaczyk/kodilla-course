package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumStatistics {
    private Statistics statistics;
    private int userQuantity;
    private int postQuantity;
    private int commentsQuantity;
    private double postAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if (userQuantity > 0) {
            postAvgPerUser = (double) postQuantity / userQuantity;
        }
        if (userQuantity > 0) {
            commentsAvgPerUser = (double) commentsQuantity / userQuantity;
        }
        if (postQuantity > 0) {
            commentsAvgPerPost = (double) commentsQuantity / postQuantity;
        }
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostAvgPerUser() {
        return postAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumStatistics that = (ForumStatistics) o;
        return userQuantity == that.userQuantity &&
                postQuantity == that.postQuantity &&
                commentsQuantity == that.commentsQuantity &&
                Double.compare(that.postAvgPerUser, postAvgPerUser) == 0 &&
                Double.compare(that.commentsAvgPerUser, commentsAvgPerUser) == 0 &&
                Double.compare(that.commentsAvgPerPost, commentsAvgPerPost) == 0 &&
                Objects.equals(statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistics, userQuantity, postQuantity, commentsQuantity, postAvgPerUser, commentsAvgPerUser, commentsAvgPerPost);
    }
}