package net.petriv.play;

import static org.junit.Assert.*;

public class SolutionTest {

    int[] clouds = new int[7];


    @org.junit.Before
    public void setUp() throws Exception {
        clouds = new int[]{0, 0, 1, 0, 0, 1, 0};
    }

    @org.junit.Test
    public void jumpingOnClouds() {
        assertEquals(4, Solution.jumpingOnClouds(clouds));



    }
}