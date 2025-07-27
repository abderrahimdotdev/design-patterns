package dev.abderrahim.designpatterns.structural.decorator.example1.beverage;

import java.math.BigDecimal;

public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("2.00");
    }
    
}
