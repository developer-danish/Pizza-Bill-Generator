public class DeluxPizza extends Pizza{
    public DeluxPizza(java.lang.Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @java.lang.Override
    public void addExtraCheese() {}

    @java.lang.Override
    public void addExtraToppings() {}
}
