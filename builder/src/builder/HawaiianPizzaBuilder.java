package builder;

public class HawaiianPizzaBuilder implements PizzaBuilder{

	private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void buildDough() {
        pizza.setDough("Cross");
    }

    public void buildSauce() {
        pizza.setSauce("Mild");
    }

    public void buildToppings() {
        pizza.setToppings("Ham + Pineapple");
    }

    public Pizza getPizza() {
        return this.pizza;
    }
}
