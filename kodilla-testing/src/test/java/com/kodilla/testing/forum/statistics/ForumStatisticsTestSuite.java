package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void before() {
        System.out.println("Test ForumStatistics: begin");
    }

    @After
    public void after() {
        System.out.println("Test ForumStatistics: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatisticsIfNoPostsWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(5);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostQuantity());
        assertEquals(0, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerPost(), 0.01);
        assertEquals(5, forumStatistics.getUserQuantity());
        assertEquals(10, forumStatistics.getCommentsQuantity());
        assertEquals(2, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }

    private void setUp() {
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsIfThousandPostsWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(5);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostQuantity());
        assertEquals(200, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(5, forumStatistics.getCommentsAvgPerPost(), 0.01);
        assertEquals(5, forumStatistics.getUserQuantity());
        assertEquals(5000, forumStatistics.getCommentsQuantity());
        assertEquals(1000, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }

    private ArrayList<String> initList(int listSize) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add("name" + 1);
        }
        return list;
    }

    @Test
    public void testCalculateAdvStatisticsIfNoCommentsWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(5);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerPost(), 0.01);
        assertEquals(5, forumStatistics.getUserQuantity());
        assertEquals(1000, forumStatistics.getPostQuantity());
        assertEquals(200, forumStatistics.getPostAvgPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsLessThanPostsWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(5);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostQuantity());
        assertEquals(500, forumStatistics.getCommentsQuantity());
        assertEquals(100, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(0.5, forumStatistics.getCommentsAvgPerPost(), 0.01);
        assertEquals(200, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(5, forumStatistics.getUserQuantity());
    }

    @Test
    public void testCalculateAdvStatisticsIfCommentsMoreThanPostsWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(5);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(500, forumStatistics.getPostQuantity());
        assertEquals(1000, forumStatistics.getCommentsQuantity());
        assertEquals(200, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(2, forumStatistics.getCommentsAvgPerPost(), 0.01);
        assertEquals(100, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(5, forumStatistics.getUserQuantity());
    }

    @Test
    public void testCalculateAdvStatisticsIfNoUsersWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(0);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUserQuantity());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(500, forumStatistics.getPostQuantity());
        assertEquals(1000, forumStatistics.getCommentsQuantity());
        assertEquals(2, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsIfHundredUsersWithMock() {
        //Given
        setUp();
        ArrayList<String> list = initList(100);
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUserQuantity());
        assertEquals(10, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(5, forumStatistics.getPostAvgPerUser(), 0.01);
        assertEquals(500, forumStatistics.getPostQuantity());
        assertEquals(1000, forumStatistics.getCommentsQuantity());
        assertEquals(2, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }
}
