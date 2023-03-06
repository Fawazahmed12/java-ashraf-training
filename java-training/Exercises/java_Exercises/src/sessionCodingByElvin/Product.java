package sessionCodingByElvin;

public class Product {

    String id;
    String category;
    String title;
    int price;
    boolean dirty;
    Product(String id,String category,String title,int price,boolean dirty){
        this.id = id;
        this.category = category;
        this.title = title;
        this.price = price;
        this.dirty = dirty;
    }
}
