package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The Main class
 */
public class Main {

    /**
     * Output of measurement results as a table for the ArrayList class
     * @param result_add measurement result of the add method
     * @param result_get measurement result of the get method
     * @param result_delete measurement result of the delete method
     * @param k number of repetitions
     */
    public static void table (Timer result_add, Timer result_get, Timer result_delete, int k) {
        System.out.printf ("%-10s%-10s%-10s%n", "Method" + "\t", "ArrayList" + "\t", "LinkedList");

        System.out.printf("%-10s", "add");
        System.out.printf("%15s", result_add);
        System.out.println();

        System.out.printf("%-10s", "get");
        System.out.printf("%16s", result_get);
        System.out.println();

        System.out.printf("%-10s", "delete");
        System.out.printf("%15s", result_delete);
        System.out.println();
    }

    /**
     * Checking user input.
     * @param in Scanner
     * @return Number of repetitions
     */
    public static int checkInput(Scanner in) {
        int k = 0;
        boolean validInput = false;

        System.out.println("Enter the number of repetitions. Enter '0' to exit:");

        do {
            if (in.hasNextInt()) {

                k = in.nextInt();
                if (k >= 0) validInput = true;
                else
                    System.out.println("You have entered incorrect input! Please enter the number of repetitions:");
            }

            else
                System.out.println("You have entered incorrect input! Please enter the number of repetitions:");
            in.nextLine();

        } while (!validInput);

        return k;
    }

    /**
     * The main methods
     * @param args The main arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 0;

        k = checkInput(in);
        while (k != 0) {
            Timer result_add = new Timer();
            result_add.addTimer(list_arr, list_link, k);

            Timer result_get = new Timer();
            result_get.getTimer(list_arr, list_link, k);

            Timer result_delete = new Timer();
            result_delete.deletionTimer(list_arr, list_link, k);

            table(result_add, result_get, result_delete, k);

            k = checkInput(in);
        }
    }
}
