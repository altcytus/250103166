package CSS217_4N.OCT20;

public class PizzaBuilder {
    public static void main(String[] args) {
        // Stacking 3 toppings: Cheese, Olives, and Pineapple onto a PlainPizza
        Pizza customPizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));

        System.out.println("Description: " + customPizza.getDescription());
        System.out.println("Total Cost: $" + customPizza.getCost());
    }
}
