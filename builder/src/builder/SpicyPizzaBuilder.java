package builder;

public class SpicyPizzaBuilder implements PizzaBuilder{
	private Pizza pizza;

    public SpicyPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void buildDough() {
        pizza.setDough("Pan");
    }

    public void buildSauce() {
        pizza.setSauce("Hot");
    }

    public void buildToppings() {
        pizza.setToppings("Pepperoni + Jalapeno");
    }

    public Pizza getPizza() {
        return this.pizza;
    }

}
