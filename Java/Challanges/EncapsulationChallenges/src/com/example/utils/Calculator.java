package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		double area;
		int x ;
		do {
			System.out.println("Enter 1 for Circle \nEnter 2 for Rectangle.");
			x = sc.nextInt();
			switch(x) {
			case 1 : System.out.println("Enter the radius of circle.");
					 double radius = sc.nextDouble();
					 circle.setRadius(radius);
					 double r = circle.getRadius();
					 area = Math.PI * Math.pow(r, 2);
					 System.out.printf("The area of circle whose radius is %f. ", area);
					 System.out.println();
					 break;
			case 2 : System.out.println("Enter the height and width of rectangle : ");
					double h = sc.nextDouble();
					double w = sc.nextDouble();
					rect.setHeight(h);
					rect.setWidth(w);
					area = rect.getHeight() * rect.getWidth();
					System.out.printf("The area of rectangle whose length is %f and width is %f is %f.",rect.getHeight(), rect.getWidth(),area);
					System.out.println();
					break;
			default : System.out.println("Enter Valid Number.");		
			}
		}while(x>0);
	}
}
