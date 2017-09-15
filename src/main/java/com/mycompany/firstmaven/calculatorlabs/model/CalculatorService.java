package com.mycompany.firstmaven.calculatorlabs.model;

/**
 *
 * @author jordanrehbein
 */
public class CalculatorService {
    
    public final double getRectangleArea(String length, String width){
        double l = Double.parseDouble(length);
        double w = Double.parseDouble(width);
        
        double area = l * w;
        
        return area;
    }
    
    public final double getCircleArea(String radius){
        double r = Double.parseDouble(radius);
        
        double area = Math.pow(r,2) * 3.14;
        
        return area;
    }
    
    public final double getHypotenuse(String sideA, String sideB){
        double a = Double.parseDouble(sideA);
        double b = Double.parseDouble(sideB);
        
        double hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        return hypotenuse;
    }
}
