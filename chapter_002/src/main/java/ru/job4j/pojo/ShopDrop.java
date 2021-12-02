package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index < products.length) {
            products[index] = null;
            for (int productIndex = index; productIndex < products.length; productIndex++) {
                if (productIndex + 1 < products.length) {
                    products[productIndex] = products[productIndex + 1];
                }
            }
            products[products.length - 1] = null;
            return products;
        } else {
            System.out.println("No element at that index!");
            return products;
        }
    }
}
