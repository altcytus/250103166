package CSS217_4N.PRACTICE1;


class Americano implements Coffee {

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double getCost() {
        return 1100;
    }
}