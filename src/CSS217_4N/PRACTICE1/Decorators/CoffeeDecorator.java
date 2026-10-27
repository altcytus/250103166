package CSS217_4N.PRACTICE1.Decorators;

import CSS217_4N.PRACTICE1.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
