package com.projects.maven;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Mariia Lapovska
 */
public class MyTest {

    @Test
    public void runTest() {
        System.out.println("Running MyTest");
        assertTrue(new AppRunner().run());
    }
}
