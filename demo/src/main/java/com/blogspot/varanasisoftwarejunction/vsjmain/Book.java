package com.blogspot.varanasisoftwarejunction.vsjmain;

public class Book {
    private String bookname,booksubject;
    private int price;

    public Book(String bookname, String booksubject, int price) {
        this.bookname = bookname;
        this.booksubject = booksubject;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooksubject() {
        return booksubject;
    }

    public void setBooksubject(String booksubject) {
        this.booksubject = booksubject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", booksubject='" + booksubject + '\'' +
                ", price=" + price +
                '}';
    }
}
