package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

/** Class whose objects contain the results of the measurements. */
public class Timer {
    /** Measurement result for the ArrayList class (timer) */
    private long t_array;

    /** Measurement result for the LinkedList class (timer) */
    private long t_link;

    /**
     * Timing
     * @return Current time in milliseconds
     */
    static private long setTime () { return System.currentTimeMillis(); }

    /**
     * The variance between the start time and the end time.
     * @param start Start time
     * @param end End time
     * @return The variance between the start time and the end time.
     */
    private long variance(long start, long end) { return end - start; }

    /** Class Constructor */
    public Timer() {
        t_array = 0;
        t_link = 0;
    }

    /** The get method
     * @return t_array time spent on actions with the ArrayList
     */
    public long getT_array() {
        return t_array;
    }

    /** The get method
     * @return t_link time spent on actions with the LinkedList
     */
    public long getT_link() { return t_link; }

    /**
     * Time measurement for the add method
     * @param list_arr an object of the ArrayList class
     * @param list_link an object of the LinkedList class
     * @param k number of repetitions
     */
    public void addTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start; int n = 7, i;
        start = Timer.setTime();
        for (i = 0; i < k; i++)
            list_arr.add(n);
        t_array = variance(start, Timer.setTime());

        start = Timer.setTime();
        for (i = 0; i < k; i++)
            list_link.add(n);
        t_link = variance(start, Timer.setTime());
    }

    /**
     * Time measurement for the get method
     * @param list_arr an object of the ArrayList class
     * @param list_link an object of the LinkedList class
     * @param k number of repetitions
     */
    public void getTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start; int i;
        Object temp;

        start = Timer.setTime();
        for (i = 0; i < k; i++)
            temp = list_arr.get(i);
        t_array = variance(start, Timer.setTime());

        start = Timer.setTime();
        for (i = 0; i < k; i++)
            temp = list_link.get(i);
        t_link = variance(start, Timer.setTime());
    }

    /**
     * Time measurement for the delete method
     * @param list_arr an object of the ArrayList class
     * @param list_link an object of the LinkedList class
     * @param k number of repetitions
     */
    public void deletionTimer(ArrayList<Integer> list_arr, LinkedList<Integer> list_link, int k) {
        long start; int i;

        start = Timer.setTime();
        for (i = k - 1; i >= 0; i--)
            list_arr.remove(i);
        t_array = variance(start, Timer.setTime());

        start = Timer.setTime();
        for (i = k - 1; i >= 0; i--)
            list_link.remove(i);
        t_link = variance(start, Timer.setTime());
    }

    /**
     * Override method toString
     */
    @Override
    public String toString() {

        return t_array + "          " + t_link;
    }
}
