package builder;

public class BuilderExample {
	public static void main(String[] args) {
        Waiter waiter = new Waiter();

        // Constructing a Hawaiian pizza
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println("Hawaiian Pizza: " + hawaiianPizza);

        // Constructing a Spicy pizza
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        System.out.println("Spicy Pizza: " + spicyPizza);
    }

}
