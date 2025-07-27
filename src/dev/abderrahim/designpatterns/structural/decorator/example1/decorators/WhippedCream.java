package dev.abderrahim.designpatterns.structural.decorator.example1.decorators;

import java.math.BigDecimal;

import dev.abderrahim.designpatterns.structural.decorator.example1.beverage.Beverage;

public class WhippedCream extends BeverageDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }
      @Override
    public String getDescription() {
        return decoratedBeverage.getDescription()+", Whipped Cream";
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedBeverage.getPrice().add(new BigDecimal("0.75"));
    }
    
}
