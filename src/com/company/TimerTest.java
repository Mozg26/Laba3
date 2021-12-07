package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * A class of tests for the Timer class
 */
public class TimerTest {

    /**
    * Test the addTimer method for negative values.
     */
    @Test
    public void addTimer_negative() {
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 10000;
        Timer result_add = new Timer();
        result_add.addTimer(list_arr, list_link, k);
        assertTrue(result_add.getT_array() > 0 && result_add.getT_link() > 0);
    }

    /**
     * Test the getTimer method for negative values.
     */
    @Test
    public void getTimer_negative() {
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 10000, n = 7;
        Timer result_get = new Timer();

        for (int i = 0; i < k; i++) {
            list_arr.add(n);
            list_link.add(n);
        }

        result_get.getTimer(list_arr, list_link, k);
        assertTrue(result_get.getT_array() > 0 && result_get.getT_link() > 0);
    }

    /**
     * Test the deletionTimer method for negative values.
     */
    @Test
    public void deletionTimer_negative() {
            ArrayList<Integer> list_arr = new ArrayList<>();
            LinkedList<Integer> list_link = new LinkedList<>();
            int k = 10000, n = 7;
            Timer result_del = new Timer();

            for (int i = 0; i < k; i++) {
                list_arr.add(n);
                list_link.add(n);
            }
            result_del.deletionTimer(list_arr, list_link, k);
            assertTrue(result_del.getT_array() > 0 && result_del.getT_link() > 0);
        }
}