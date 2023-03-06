package Ecommerce.Day1_task;

import java.util.ArrayList;

public class OrderItem {
    public OrderItem(String name, double unitPrice, int count) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double calcCost() {
        return this.unitPrice * this.count;
    }

    public void getItemsOfApple(ArrayList<OrderItem> items) {
        for (OrderItem item : items) {
            if (item.name == "Apple" && item.count > 10) {
                System.out.println(item.name + "Add a Product called PaperBag with Zero price");
            }
        }
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", count=" + count +
                '}';
    }

    private String name;
    private double unitPrice;
    private int count;

}
