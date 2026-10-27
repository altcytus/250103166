package CSS217_4N.OCT20;
class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
