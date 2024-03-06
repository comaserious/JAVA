package com.ohgiraffers.section01.book;

import java.util.Objects;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {}
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*필기. 두 인스턴스의 주소가 같으면 true 를 반환*/
        if (this == o) return true;
        /*필기. 다른 필드들을 비교해서 같지 않으면 false 같으면 true를 반환한다*/
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(number, title, author, price);
//    }
}
