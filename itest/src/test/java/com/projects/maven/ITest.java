package com.projects.maven;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Mariia Lapovska
 */
public class ITest {

    @Test
    public void runTest() {
        System.out.println("Running ITest");
        assertFalse(new AppRunner().stop());
    }
}
