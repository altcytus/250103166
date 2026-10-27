package CSS217_4N.PRACTICE1.Decorators;

import CSS217_4N.PRACTICE1.Coffee;

public class Cinnamon extends CoffeeDecorator {

    public Cinnamon(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Cinnamon";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30;
    }
}