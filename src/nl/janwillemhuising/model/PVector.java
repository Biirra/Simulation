package nl.janwillemhuising.model;

import java.util.Random;

/**
 * Created by JanWillem Huising on 21-5-2017.
 */
public class PVector {
    double x;
    double y;


    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public PVector(double x_, double y_){
        this.x = x_;
        this.y = y_;
    }
    public void set(double x_, double y_){
        x = x_;
        y = y_;
    }
    public void set(PVector v){
        x = v.getX();
        y = v.getY();
    }
    public void add(PVector v){
        this.x += v.x;
        this.y += v.y;
    }
    public static PVector add(PVector v1, PVector v2){
        PVector v3 = new PVector(v1.x + v2.x, v1.y + v2.y);
        return v3;
    }
    public void sub(PVector v){
        this.x -= v.x;
        this.y -= v.y;
    }
    public static PVector sub(PVector v1, PVector v2){
        PVector v3 = new PVector(v1.x - v2.x, v1.y - v2.y);
        return v3;
    }
    public void mult(double m){
        this.x = this.x*m;
        this.y = this.y*m;
    }
    public static PVector mult(PVector v1, float m){
        PVector v3 = new PVector(v1.x * m, v1.y * m);
        return v3;
    }
    public void div(double n){
        this.x = this.x/n;
        this.y = this.y/n;
    }
    public static PVector div(PVector v1, double m){
        PVector v3 = new PVector(v1.x / m, v1.y / m);
        return v3;
    }
    public double mag(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public void normalize(){
        double m = mag();
        if(m != 0){
            div(m);
        }
    }
    public void limit(float max){
        if(mag() > max){
            normalize();
            mult(max);
        }
    }

    public static PVector random2D() {
        Random rand = new Random();
        return new PVector(rand.nextFloat(),rand.nextFloat());
    }

    public static PVector copy(PVector original){
        PVector clone = new PVector(original.x,original.y);

        return clone;
    }
    public double heading2D(){
        return Math.atan2(y,x);
    }


    @Override
    public String toString(){
        String output = "x: " + x+ " y: " + y;
        return output;
    }
}
