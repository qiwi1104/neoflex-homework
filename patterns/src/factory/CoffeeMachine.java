package factory;

public class CoffeeMachine {
    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine() {
        coffeeFactory = new CoffeeFactory();
    }

    public void serveCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        System.out.println(coffee.getType() + " served.");
    }
}
