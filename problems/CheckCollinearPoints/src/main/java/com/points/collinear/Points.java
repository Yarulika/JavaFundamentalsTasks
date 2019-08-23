package com.points.collinear;

public class Points {
    int x1;
    int x2;
    int x3;
    int y1;
    int y2;
    int y3;

    public Points(int x1, int y1, int x2, int y2, int x3, int y3) {
        // initialize state
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public boolean isCollinear() {
        float s,s1,s2 = 1;
//        s1 = (x1*y2 + x2*y3 + x3*y1);
//        s2 = (x2*y1 + x3*y2 + x1*y3);
//        s = 0.5f * (s1 - s2);

        s = ( (x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3) )/2;
//        if (s==0){return true;}
//        else return false;
        return s==0;
    }
}
