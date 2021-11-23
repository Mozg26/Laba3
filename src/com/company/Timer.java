package com.company;

/** Class whose objects contain the results of the measurements. */
public class Timer {
    /** Measurement result for the ArrayList class (timer) */
    private long t_array;

    /** Measurement result for the LinkedList class (timer) */
    private long t_link;

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
    public long getT_link() {
        return t_link;
    }

    /**
     * The set method
     * @param t time spent on actions with the ArrayList
     */
    public void setT_array(long t) {
        t_array = t;
    }

    /**
     * The set method
     * @param t time spent on actions with the LinkedList
     */
    public void setT_link(long t) {
        t_link = t;
    }
}
