package Ecommerce.Day2_task;


import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartApp {
    private static ArrayList<OrderItem> items;

    public static void main(String[] args) {

        ShoppingCart cartOne = new ShoppingCart(); // Create One Shopping Cart
        String productToCheckForPaperBag = "Grapes";
        int productCountToCheckForPaperBag = 6;

        println("\nInitialize cart..");
        cartOne.add(new OrderItem("Apple", 2.49, 5));
        cartOne.add(new OrderItem("Milk", 3.99, 2));
        cartOne.add(new OrderItem("Bread", 5.49, 1));
        cartOne.add(new OrderItem("Cheese", 8.99, 2));
        cartOne.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);
        println(cartOne.toString());
        println("Total cost:" + cartOne.totalPrice());


        ShoppingCart cartTwo = new ShoppingCart(); // Create One Shopping Cart
        cartTwo.add(new OrderItem("Orange", 1.50, 15));
        cartTwo.add(new OrderItem("Milk", 3.99, 1));

        cartTwo.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);
        println(cartTwo.toString());
        println("Total cost:" + cartTwo.totalPrice());


        ShoppingCart cartThree = new ShoppingCart(); // Create One Shopping Cart
        cartThree.add(new OrderItem("Grapes", 3.50, 9));
        cartThree.add(new OrderItem("Butter", 2.99, 3));
        cartThree.add(new OrderItem("Wheat", 4.99, 1));
        cartThree.addPaperBagIfBoughtMoreItems(productToCheckForPaperBag, productCountToCheckForPaperBag);
        println(cartThree.toString());
        println("Total cost:" + cartThree.totalPrice());

        List<ShoppingCart> allShoppingCarts = new ArrayList<>();
        allShoppingCarts.add(cartOne);
        allShoppingCarts.add(cartTwo);
        allShoppingCarts.add(cartThree);

        ShortCartAnalytics shortCartAnalytics = analyseShoppingCarts(allShoppingCarts);

        shortCartAnalytics.setProductWithMaxItems(shortCartAnalytics.productWithMaxItems);
        System.out.println("productWithMaxItems = " + shortCartAnalytics.getProductWithMaxItems());

        shortCartAnalytics.setProductWithMaxItems(String.valueOf(shortCartAnalytics.productMaxCount));
        System.out.println("productMaxCount = " + shortCartAnalytics.getProductMaxCount());

        shortCartAnalytics.setProductWithMaxItems(String.valueOf(shortCartAnalytics.idOfExpensiveShoppingCart));
        System.out.println("expensiveProduct = " + shortCartAnalytics.getIdOfExpensiveShoppingCart());

    }


    public static ShortCartAnalytics analyseShoppingCarts(List<ShoppingCart> carts) {

        //productWithMaxItems
        Map<Long,String> maxItemsMap = new HashMap<>();

        List<OrderItem> orderItemArrayList = new ArrayList<>();

        for (ShoppingCart cart : carts) {
            for (OrderItem ct : cart.items) {
                orderItemArrayList.add(ct);
            }
        }

        for (int i=0;i<orderItemArrayList.size();i++){
            Long count = 1L;
            for (int j=i+1;j<orderItemArrayList.size();j++){
                if (orderItemArrayList.get(i).getName() == orderItemArrayList.get(j).getName()){
                    count++;
                }
            }
            maxItemsMap.put(count,orderItemArrayList.get(i).getName());
        }

        String key = null;

        Long maxValueMap = (Collections.max(maxItemsMap.keySet()));
        for(Map.Entry<Long,String> entry : maxItemsMap.entrySet()) {
            if (entry.getKey() == maxValueMap) {
                key = entry.getValue();
            }
        }


        //productMaxCount
        int maximum = orderItemArrayList.get(0).getCount();
        for (int i = 1; i < orderItemArrayList.size(); i++) {
            if (maximum < orderItemArrayList.get(i).getCount())
                maximum = orderItemArrayList.get(i).getCount();
        }

        //idOfExpensiveShoppingCart
        double mostExpensive = 0;
        OrderItem expensiveProduct = null;
        for(OrderItem P1 : orderItemArrayList) {
            if(P1.getUnitPrice() > mostExpensive){
                expensiveProduct = P1;
                mostExpensive = P1.getUnitPrice();
            }
        }
       double expensiveShoppingCart = expensiveProduct.getUnitPrice();
        System.out.println(mostExpensive);
        System.out.println(expensiveProduct);

        return new ShortCartAnalytics(key,maximum, (int) expensiveShoppingCart);
    }

    static void println(String content) {
//        System.out.println(content);
    }
}
