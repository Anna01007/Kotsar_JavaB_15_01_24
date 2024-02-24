package hw15;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    // Constructor for a regular burger
    public Burger() {
        this.bun = "wheat bun";
        this.meat = "pork and beef";
        this.cheese = "cheddar cheese";
        this.greens = "salad and tomatoes";
        this.mayo = "mayo";
        printIngredients();
    }

    // Constructor for Diet burger
    public Burger(boolean isDiet) {
        this.bun = "gluten-free bun";
        this.meat = "chicken";
        this.cheese = "mozzarella";
        this.greens = "spinach and cucumbers";
        this.mayo = isDiet ? "without mayo" : "mayo";
        printIngredients();
    }

    // Constructor for Burger with double meat
    public Burger(int doubleMeat) {
        this.bun = "wheat bun";
        this.meat = "two servings of beef";
        this.cheese = "sharp cheese";
        this.greens = "spinach and nettle";
        this.mayo = "mustard sauce";
        printIngredients();
    }

    private void printIngredients() {
        System.out.println("The composition of the burger: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }
}