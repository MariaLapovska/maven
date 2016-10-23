package com.projects.maven;

/**
 * @author Mariia Lapovska
 */
public class AppRunnerOne {
    public static void main(String[] args) {
        System.out.println("Arguments:");

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}