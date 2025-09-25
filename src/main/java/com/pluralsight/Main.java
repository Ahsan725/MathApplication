package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Question 1:
        int bobSalary = 50000;
        int garySalary = 90000;
        int highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2:
        int carPrice = 94092;
        int truckPrice = 5456;

        System.out.println("The smallest price is: " + Math.min(carPrice, truckPrice));

        //Question 3:
        //pi * radius * radius
        double radius = 7.25;
        double area = Math.PI * (radius * radius);
        System.out.println("The area of a circle with a radius of 7.25 is: " + area);

        //Question 4:
        double num = 5.0;
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is: " + squareRoot);

        //Question 5:
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;
        double distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));

        System.out.println("The distance between the two coordinates is: " + distance);

        //Question 6;
        double num2 = -3.8;
        System.out.println("The absolute value of " + num2 + " is: " + Math.abs(num2));

        //Question 7:
        System.out.println("Here is a random number between 0 and 1: " + Math.random());

        //Question 8;
        int days = 24;
        int hours = days * 24;
        int mins = hours * 60;
        int seconds = mins * 60;
        int millisecs = seconds * 1000;

        System.out.println("There are " + hours + " hours, " + mins + " mins, " + seconds + " seconds, "  + millisecs + " miliseconds in 24 days") ;



    }
}
