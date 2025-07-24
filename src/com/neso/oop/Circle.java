package com.neso.oop;

import java.awt.*;
import java.sql.SQLOutput;

public class Circle {
   private double radius;

   public double getRadius(){
       return radius;
   }

   public void setRadius(double radius){
       this.radius = (radius >= 0) ? radius : 0;
   }

}
