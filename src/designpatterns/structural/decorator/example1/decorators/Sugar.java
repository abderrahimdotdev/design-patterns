package designpatterns.structural.decorator.example1.decorators;

import java.math.BigDecimal;

import designpatterns.structural.decorator.example1.beverage.Beverage;

public class Sugar extends BeverageDecorator{

    public Sugar(Beverage beverage) {
        super(beverage);
    }
     @Override
    public String getDescription() {
        return decoratedBeverage.getDescription()+", Sugar";
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedBeverage.getPrice().add(new BigDecimal("0.20"));
    }
    
}
