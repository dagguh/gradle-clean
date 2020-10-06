package com.github.dagguh.gradle.clean;

import org.junit.Assert;
import org.junit.Test;

public class BrokenTest {
    @Test public void testDeliberatelyFails() {
        Assert.fail("fail deliberately");
    }
}
