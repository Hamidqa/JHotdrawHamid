/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;

/**
 *
 * @author HamidQ
 */
public class DataNode {

    private double x, y, x1, y1, x2, y2;

    public DataNode() {
        x = 0.0f;
        y = 0.0f;
        x1 = 0.0f;
        y1 = 0.0f;
        x2 = 0.0f;
        y2 = 0.0f;
    }

   // y1  = y2 = node.y[0];
   // x1  = x2 = node.x[0];

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

}
