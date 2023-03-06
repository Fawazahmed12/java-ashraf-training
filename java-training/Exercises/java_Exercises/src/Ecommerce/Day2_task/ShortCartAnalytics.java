package Ecommerce.Day2_task;

public class ShortCartAnalytics {
    String productWithMaxItems; //milk
    int productMaxCount; //orange 15
    Integer idOfExpensiveShoppingCart; //8.99

    public ShortCartAnalytics(String productWithMaxItems, int productMaxCount, Integer idOfExpensiveShoppingCart) {
        this.productWithMaxItems = productWithMaxItems;
        this.productMaxCount = productMaxCount;
        this.idOfExpensiveShoppingCart = idOfExpensiveShoppingCart;
    }

    public String getProductWithMaxItems() {
        return productWithMaxItems;
    }

    public void setProductWithMaxItems(String productWithMaxItems) {
        this.productWithMaxItems = productWithMaxItems;
    }

    public int getProductMaxCount() {
        return productMaxCount;
    }

    public void setProductMaxCount(int productMaxCount) {
        this.productMaxCount = productMaxCount;
    }

    public Integer getIdOfExpensiveShoppingCart() {
        return idOfExpensiveShoppingCart;
    }

    public void setIdOfExpensiveShoppingCart(Integer idOfExpensiveShoppingCart) {
        this.idOfExpensiveShoppingCart = idOfExpensiveShoppingCart;
    }
}
