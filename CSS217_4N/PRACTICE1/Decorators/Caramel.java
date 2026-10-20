package CSS217_4N.PRACTICE1.Decorators;

import CSS217_4N.PRACTICE1.Coffee;

public class Caramel extends CoffeeDecorator {

    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 200;
    }
}