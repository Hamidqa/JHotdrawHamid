package org.jhotdraw.samples.svg.figures;


import java.awt.Graphics2D;
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
public class SVGPathFigureTest {
    
    public SVGPathFigureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of drawFigure method, of class SVGPathFigure.
     */
    @Test
    public void testDrawFigure() {
        System.out.println("drawFigure");
        Graphics2D g = null;
        SVGPathFigure instance = new SVGPathFigure();
        instance.drawFigure(g);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
