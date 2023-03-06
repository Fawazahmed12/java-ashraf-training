package Ecommerce.Day1_task;

import java.util.ArrayList;

public class ShoppingCart {
    public static   OrderItem orderItem;
    public static int shoppingCartCount;

    public ShoppingCart(){
        shoppingCartCount++;
        this.items = new ArrayList<>();

    }

    public void add( OrderItem orderItem) {
        items.add(orderItem);
    }

    public void remove( int index) {
        items.remove(index);
    }

    public double totalPrice() {
        double total = 0.0;
        int shippingCost = 5;
        double discount = 0;
        double shippingApply = 0;
        for (OrderItem item : items) {
            total += item.calcCost();
        }
            if (total > 12) {
                discount = (0.08) * total;
                System.out.println(discount);
            } else if (total < shippingCost) {
                shippingApply = shippingCost + total;
                System.out.println(shippingApply);
            }
        orderItem.getItemsOfApple(items);
        double output = total - discount;
        return output;

    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }

    private ArrayList<OrderItem> items;

}
