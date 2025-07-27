package dev.abderrahim.designpatterns.structural.decorator.example1.beverage;

import java.math.BigDecimal;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public BigDecimal getPrice() {
            return new BigDecimal("1.50");
    }
    
}
