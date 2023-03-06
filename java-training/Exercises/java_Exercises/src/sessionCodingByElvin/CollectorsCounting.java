package sessionCodingByElvin;

import java.util.*;
import java.util.stream.Collectors;
public class CollectorsCounting {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("11", "perfume", "fragrance", 13,true));
        products.add(new Product("20", "perfume", "fragrance", 13,true));
        products.add(new Product("21", "perfume", "fragrance", 13,true));
        products.add(new Product("12", "cereals muesli fruit nuts", "groceries", 50,true));
        products.add(new Product("13", "Hyaluronic Acid Serum", "skincare", 23,true));
        products.add(new Product("14", "Eau De Perfume Spray", "fragrance", 40,true));
        products.add(new Product("15", "Tree Oil 30ml", "skincare", 9,true));

String res = products.stream().collect(Collectors.groupingBy((product) -> product.category, Collectors.counting())).keySet().stream()
                .max(Comparator.comparing(a->a))
                .get();

        System.out.println(res);


 Map<Long,String> result = new HashMap<>();
            for(int i=0;i<products.size();i++){
                Long count =1L;
                for(int j=i+1;j<products.size();j++){
                    if((products.get(i).category == products.get(j).category) && products.get(i).dirty  ){
                        count++;
                        products.get(j).dirty = false;
                    }
                }
                result.put(count,products.get(i).category);
            }
        System.out.println(result);

        Long maxValueInMap = (Collections.max(result.keySet()));
        for (Map.Entry<Long,String> entry : result.entrySet()){
            if(entry.getKey() == maxValueInMap){
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
            }

        }

    }



}


