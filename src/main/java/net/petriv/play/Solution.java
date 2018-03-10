package net.petriv.play;

import java.util.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {

        int amountOfClouds = c.length - 1;
        int jump = 0;

        if (amountOfClouds == 1) return 1; // if only 2 clouds return 1 jump

        for (int i = 0; (i + 2) <= amountOfClouds; ) {

            if (c[i + 2] == 0) { // first try to jump Cn+2
                jump++;          //increse amount jumping
                i += 2;           // jump on cloud

                if ((amountOfClouds - 1) != i) { // if we are on last but one cloud just one jump
                    continue;
                } else jump++;

            } else if (c[i + 1] == 0) {  // jump to Cn+1
                jump++;                  //increse amount jumping
                i++;                     //jump on cloud
                continue;
            } else return -1; // -1 means lose the game
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter amount of clouds: min 2 max 100  ");
        int n = in.nextInt();
        int[] c = new int[n];

        //Cloud C0 and Cn-1 by default 0
        System.out.println("Please enter " + (n - 2) + " describing clouds '0 ordinary' '1 thundercloud'  ");
        for (int c_i = 0; c_i < n - 2; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}



