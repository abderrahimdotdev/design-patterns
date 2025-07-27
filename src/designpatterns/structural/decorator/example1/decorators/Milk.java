package designpatterns.structural.decorator.example1.decorators;

import java.math.BigDecimal;

import designpatterns.structural.decorator.example1.beverage.Beverage;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription()+", Milk";
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedBeverage.getPrice().add(new BigDecimal("0.50"));
    }
    
}
