package com.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {

        for (int i=1; i<=10;i++) {
            Book book = new Book();
            book.setBid(i*100);
            book.setBname("Name " +i);
            getBooks().add(book);
        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//    @Override
//    protected BookShop clone() throws CloneNotSupportedException {

        return super.clone();
// Deep Clone
//        BookShop shop = new BookShop();
//        for (Book book :this.getBooks()){
//            shop.getBooks().add(book);
//        }
//
//        return BookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
