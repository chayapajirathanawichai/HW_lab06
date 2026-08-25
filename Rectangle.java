/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;

public class Rectangle extends GeometricObject{
    private double base,height;

    public Rectangle() {
        this(3.5,4.6);
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle(double base, double height, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.height = height;
    }
    
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setHeight(double height){
        this.height=height;
    }
    
    @Override
    public double findArea() {
        return (1.0/2.0)*base*height;
    }

    @Override
    public double findPerimeter() {
        return 3.0*base;
    }
    @Override
    public String toString(){
        return "Rectangle: base= "+base+"height= "+height;
    }
}
