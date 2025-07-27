package dev.abderrahim.designpatterns.structural.decorator.example1;

import dev.abderrahim.designpatterns.structural.decorator.example1.beverage.Beverage;
import dev.abderrahim.designpatterns.structural.decorator.example1.beverage.Espresso;
import dev.abderrahim.designpatterns.structural.decorator.example1.beverage.HouseBlend;
import dev.abderrahim.designpatterns.structural.decorator.example1.decorators.Milk;
import dev.abderrahim.designpatterns.structural.decorator.example1.decorators.Sugar;
import dev.abderrahim.designpatterns.structural.decorator.example1.decorators.WhippedCream;

public class Demo {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new WhippedCream(beverage);

        System.out.println("Order: " + beverage.getDescription()); // OUTPUT: Order: Espresso, Milk, Whipped Cream
        System.out.printf("Total Cost: $%.2f%n", beverage.getPrice()); // OUTPUT: Total Cost: $3,25

        Beverage anotherBeverage = new HouseBlend();
        anotherBeverage = new Sugar(new WhippedCream(new Milk(anotherBeverage)));

        System.out.println("Order: " + anotherBeverage.getDescription()); // OUTPUT: Order: House Blend Coffee, Milk, Whipped Cream, Sugar
        System.out.printf("Total Cost: $%.2f%n", anotherBeverage.getPrice()); // OUTPUT: Total Cost: $2,95
    }
}
