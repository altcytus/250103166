package CSS217_4N.OCT20;

class Cheese extends PizzaDecorator {
    public Cheese(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}