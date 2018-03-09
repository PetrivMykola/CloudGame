package net.petriv.play;

import java.util.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        int lenght = c.length - 1;
        int jump = 0;

        for (int i = 0; i < lenght & (i + 2) <= lenght; ) {

            if (c[i + 2] == 0) {
                jump++;
                i+=2;
                continue;

            } else if (c[i + 1] == 0) {
                jump++;
                i++;
                continue;

            } else return -1;

        }

        return jump;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter amount of clouds: min 2 max 100  ");
        int n = in.nextInt();
        int[] c = new int[n];

        //Cloud C0 and Cn-1 by default 0
        System.out.println("Please enter " + n + " describing clouds '0 ordinary' '1 thundercloud' ");
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}



