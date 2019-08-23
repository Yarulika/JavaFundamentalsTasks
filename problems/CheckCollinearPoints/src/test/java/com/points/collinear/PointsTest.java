package com.points.collinear;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointsTest {

    @Test
    public void isCollinear() {
        Points p = new Points(0,0,0,0,0,0);
        Assert.assertTrue("all zeroes colliners", p.isCollinear());
    }
}
