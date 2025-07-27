package dev.abderrahim.designpatterns.structural.decorator.example1.decorators;

import java.math.BigDecimal;

import dev.abderrahim.designpatterns.structural.decorator.example1.beverage.Beverage;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage decoratedBeverage;

    protected BeverageDecorator(Beverage beverage){
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedBeverage.getPrice();
    }
    
}
