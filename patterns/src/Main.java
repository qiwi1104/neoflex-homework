import adapter.Computer;
import adapter.MemoryCard;
import adapter.UsbAdapter;
import factory.CoffeeMachine;
import factory.CoffeeType;
import proxy.Connection;
import proxy.Proxy;
import singleton.Logger;

public class Main {

    public static void main(String[] args) {
        // singleton
        Logger logger = Logger.getInstance();
        logger.printClassName("String".getClass());
        logger.printClassName(Integer.valueOf(3).getClass());
        System.out.println();

        // factory
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.serveCoffee(CoffeeType.ESPRESSO);
        coffeeMachine.serveCoffee(CoffeeType.AMERICANO);
        System.out.println();

        // adapter
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter adapter = new UsbAdapter(memoryCard);
        computer.read(adapter);
        System.out.println();

        // proxy
        Connection connection = new Connection("database");
        Proxy proxy = new Proxy(connection);
        proxy.connect();
    }
}
