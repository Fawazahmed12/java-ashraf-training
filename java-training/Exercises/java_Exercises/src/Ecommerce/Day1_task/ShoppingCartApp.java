package Ecommerce.Day1_task;

public class ShoppingCartApp {

    public static void main(String[] args) {
        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart

        println("\nInitialize cart..");
        cartOne.add(new OrderItem("Apple", 2.49, 5));
        System.out.println();
        cartOne.add(new OrderItem("Milk", 3.99, 2));
        cartOne.add(new OrderItem("Bread", 5.49, 1));
        cartOne.add(new OrderItem("Cheese", 8.99, 2));

        println(cartOne.toString());
        println("Total cost:" + cartOne.totalPrice());
//
        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.add(new OrderItem("Orange", 1.50, 15));
        cartTwo.add(new OrderItem("Milk", 3.99, 1));

        println(cartTwo.toString());
        println("Total cost:" + cartTwo.totalPrice());


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.add(new OrderItem("Grapes", 3.50, 9));
        cartThree.add(new OrderItem("Butter", 2.99, 3));
        cartThree.add(new OrderItem("Wheat", 4.99, 1));
        println(cartThree.toString());
        println("Total cost:" + cartThree.totalPrice());

        System.out.println("Total Number of ShoppingCarts = " + ShoppingCart.shoppingCartCount);


    }

    static void println(String content) {
        System.out.println(content);
    }
}
