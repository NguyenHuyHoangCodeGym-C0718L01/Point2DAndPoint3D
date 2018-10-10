package com.company;

public class Point2DTest {
    public static void main(String[] args){
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        point2D.setXY(2.4f, 3.6f);
        System.out.println("x = "+point2D.getXY()[0]+", y = "+point2D.getXY()[1]);


        Point2D point2D1 = new Point2D(1.2f, 5.5f);
        System.out.println(point2D1.toString());
        point2D1.setXY(0.5f, 0.1f);
        System.out.println("x = "+point2D1.getXY()[0]+", y = "+point2D1.getXY()[1]);
    }
}
