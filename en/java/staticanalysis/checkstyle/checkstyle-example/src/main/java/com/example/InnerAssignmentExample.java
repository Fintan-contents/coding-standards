/*
 * Header example
 */
package com.example;

/**
 * Example of InnerAssignment code.
 */
public class InnerAssignmentExample {

    /**
     * Example of InnerAssignment code.
     */
    public void example() {

        int i;
        String s = Integer.toString(i = 2);   // Substituted in the equation (incorrect).

        System.out.println(String.valueOf(i));
        System.out.println(s);
    }
}
