package net.petriv.play;

import static org.junit.Assert.*;

public class SolutionTest {

    int[] tenClouds = new int[10];
    int[] sevenClouds = new int[7];
    int[] twoClouds = new int[2];


    @org.junit.Before
    public void setUp() throws Exception {
        tenClouds = new int[]{0, 0, 1, 0, 0, 1, 0, 1, 0, 0};
        sevenClouds = new int[]{0, 0, 1, 0, 1, 0, 0};
        twoClouds = new int[] {0, 0};
    }

    @org.junit.Test
    public void jumpingOnTenClouds() {
        assertEquals(6, Solution.jumpingOnClouds(tenClouds));
    }

    @org.junit.Test
    public void jumpingOnSevenClouds() {
        assertEquals(4, Solution.jumpingOnClouds(sevenClouds));
    }
    @org.junit.Test
    public void jumpingOnTwoClouds() {
        assertEquals(1, Solution.jumpingOnClouds(twoClouds));
    }
}