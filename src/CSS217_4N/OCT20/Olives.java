package CSS217_4N.OCT20;

class Olives extends PizzaDecorator {
    public Olives(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}