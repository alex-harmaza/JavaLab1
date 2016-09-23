package com.epam.lab1.task12;

/**
 * Created by Aliaksandr_Harmaza on 9/21/2016.
 */
public class Book implements Cloneable {

    private String title;
    private String author;
    private int price;
    private static int edition;


    public Book(){}

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
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

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (object.getClass() != this.getClass()){
            return false;
        }

        Book other = (Book) object;

        if (price != other.price){
            return false;
        }
        if (title != null && !title.equals(other.title)){
            return false;
        }
        if (author != null && !author.equals(other.author)){
            return false;
        }
        if (title != other.title | author != other.author){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = result * 17 + (author != null ? author.hashCode() : 0);
        result = result * 37 + price;
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        return book;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Book");
        if (title != null){
            builder.append("\n\ttitle: ").append(title);
        }
        if (author != null){
            builder.append("\n\tauthor: ").append(author);
        }
        builder.append("\n\tprice: ").append(price);
        return builder.toString();
    }
}
