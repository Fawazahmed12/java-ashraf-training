package sessionCodingByElvin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorStream {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("11", "perfume", "fragrance", 13,true));
        products.add(new Product("12", "cereals muesli fruit nuts", "groceries", 50,true));
        products.add(new Product("13", "Hyaluronic Acid Serum", "skincare", 23,true));
        products.add(new Product("14", "Eau De Perfume Spray", "fragrance", 40,true));
        products.add(new Product("15", "Tree Oil 30ml", "skincare", 9,true));

        Map<String, List<Product>> groupedProducts = products.stream().collect(Collectors.groupingBy((product) -> product.category, Collectors.toList()));

        System.out.println(groupedProducts);
    }
}
