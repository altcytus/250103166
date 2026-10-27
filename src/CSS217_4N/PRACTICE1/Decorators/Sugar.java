package CSS217_4N.PRACTICE1.Decorators;

import CSS217_4N.PRACTICE1.Coffee;

public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 50;
    }
}
