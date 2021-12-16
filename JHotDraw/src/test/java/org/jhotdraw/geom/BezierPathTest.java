/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;


import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HamidQ
 */
public class BezierPathTest {
    
    public BezierPathTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of checkNode method, of class BezierPath.
     */
    @Test
    public void testCheckNode() {
        System.out.println("checkNode");
        double x = 0.0;
        double y = 0.0;
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        BezierPath instance = new BezierPath();
        instance.addPoint(1, 2);
        
    }

    /**
     * Test of getBounds2D method, of class BezierPath.
     */
    @Test
    public void testGetBounds2D() {
        System.out.println("getBounds2D");
        BezierPath.Node node1 = new BezierPath.Node();
        node1.setTo(node1);
        BezierPath instance = new BezierPath();
        Rectangle2D.Double result = instance.getBounds2D();
        boolean result2 = instance.add(node1);
        assertTrue(instance.add(node1));
    }
}
