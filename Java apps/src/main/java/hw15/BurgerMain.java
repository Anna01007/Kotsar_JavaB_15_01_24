package hw15;

public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("A regular burger:");
        Burger regularBurger = new Burger();

        System.out.println("\nDiet burger:");
        Burger dietBurger = new Burger(true);

        System.out.println("\nBurger with double meat:");
        Burger doubleMeatBurger = new Burger(2);
    }
}