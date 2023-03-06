//package Ecommerce;
//
//import java.util.*;
//
//public class Try {
//
//    public static ShortCartAnalytics analyseShoppingCarts(List<ShoppingCart> carts) {
//
//        Map<Long,String> maxItemsMap = new HashMap<>();
//
//        List<OrderItem> orderItemArrayList = new ArrayList<OrderItem>();
//
//        for (ShoppingCart cart : carts) {
////            System.out.println(cart);//single single cart
//            for (OrderItem ct : cart.items) {
//                orderItemArrayList.add(ct);
////                System.out.println(ct); //single single items product
////                System.out.println(rseItem);
//            }
//        }
//
////        output = rseItem.stream().collect(Collectors.groupingBy((ct) -> ct.getName(), Collectors.counting()));
//        for (int i=0;i<orderItemArrayList.size();i++){
//            Long count = 1L;
//            for (int j=i+1;j<orderItemArrayList.size();j++){
//                if (orderItemArrayList.get(i).getName() == orderItemArrayList.get(j).getName()){
//                    count++;
//                }
//            }
//            maxItemsMap.put(count,orderItemArrayList.get(i).getName());
//        }
////        System.out.println(keyAgainstValueMap);
//
//        String key = null;
//        int res1 = 0;
//        Integer res2 = null;
//
//        Long maxValueMap = (Collections.max(maxItemsMap.keySet()));
////        System.out.println(maxValueMap); //2
//        for(Map.Entry<Long,String> entry : maxItemsMap.entrySet()) {
//            if (entry.getKey() == maxValueMap) {
//                key = entry.getValue();
//                System.out.println(key);
////                System.out.println("KEY=" + entry.getKey() + " " +
////                        "Value=" + entry.getValue()    );
//            }
//        }
//
////        for (Map.Entry<Long, String> currentEntry : output.entrySet()) {
////
////            Map.Entry<Long, String> entryWithMaxValue = null;
////            if (entryWithMaxValue == null || currentEntry.getValue().compareTo(entryWithMaxValue.getValue()) > 0) {
////
////                entryWithMaxValue = currentEntry;
////                System.out.println(entryWithMaxValue);
////            }
////        }
//
//        return new ShortCartAnalytics(key,res1,res2);
//    }
//
//}
