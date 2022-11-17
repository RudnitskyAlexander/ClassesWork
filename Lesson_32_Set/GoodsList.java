package Lesson_32_Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodsList {
    public static void main(String[] args) {
        //сортировка товара по разным полям

        Product[] productArray = {
                new Product("Fork", 1.25, 5),
                new Product("Spoon", 1.25, 5),
                new Product("Pan", 10.99, 3),
                new Product("Knife", 1.43, 2),
                new Product("Knife", 5.12, 5),
                new Product("Spatula", 2.12, 4),
                new Product("Plate", 3.40, 4)
        };

        List<Product> product = Arrays.asList(productArray);
        System.out.println("Сортировака по имени");
//        Collections.sort(product, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(product, compByName);
        System.out.println(product);

        Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
        Collections.sort(product, compByPrice);
        System.out.println(product);
        Collections.sort(product, Collections.reverseOrder(compByPrice));
        System.out.println(product);

        Comparator<Product> compByRank = (o1, o2) -> Double.compare(o1.getRank(), o2.getRank());
        Collections.sort(product, compByRank);
        System.out.println(product);

        sortProducts(product, 2, false);
        System.out.println(product);

        sortProducts(product, 2, true);
        System.out.println(product);

    }

    public static void sortProducts(List<Product> product, int choice, boolean reverce) {
        switch (choice) {
            case 1:
                Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
                Collections.sort(product, compByName);
                Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                Collections.sort(product, compByPrice);


                Comparator<Product> compByRank = (o1, o2) -> Double.compare(o1.getRank(), o2.getRank());
                Collections.sort(product, compByRank);
                System.out.println(product);

                break;
            case 2:
                Comparator<Product> compByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
                if (!reverce) {
                    Collections.sort(product, compByPrice);
                } else {
                    Collections.sort(product, Collections.reverseOrder(compByPrice));
                }
                break;
        }
    }


}
