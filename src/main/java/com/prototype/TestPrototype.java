package com.prototype;

public class TestPrototype {

    public static void main(String[] args) {
        BookShop shop = new BookShop();
        shop.setShopName("Novel");
        shop.loadBooks();

        try {
            BookShop shop2 = (BookShop)shop.clone();
            shop2.setShopName("New");
            shop2.getBooks().remove(2);

            System.out.println(shop);
            System.out.println(shop2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
