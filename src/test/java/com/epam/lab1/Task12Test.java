package com.epam.lab1;

import com.epam.lab1.task12.Book;
import org.junit.Assert;
import org.junit.Test;
import java.awt.Color;


public class Task12Test extends Assert {

    @Test
    public void checkEqualsByLink(){
        Book book = new Book("", "", 0);
        assertTrue(book.equals(book));
    }

    @Test
    public void checkEqualsByNull(){
        Book book = new Book("", "", 0);
        assertFalse(book.equals(null));
    }

    @Test
    public void checkNotEqualsByOtherClass(){
        Book book = new Book("", "", 0);
        assertFalse(book.equals(new Color(0, 0, 0)));
    }

    @Test
    public void checkNotEqualsWithAllFields(){
        Book firstBook = new Book("t", "", 12);
        Book secondBook = new Book("title", "a", 0);
        assertFalse(firstBook.equals(secondBook));
    }

    @Test
    public void checkEqualsBooksHashcode(){
        Book b1 = new Book("", "", 0);
        Book b2 = new Book("", "", 0);
        assertTrue(b1.hashCode() == b2.hashCode());
    }

    @Test
    public void checkNotEqualsBooksHashcode(){
        Book b1 = new Book("", "author", 12);
        Book b2 = new Book("", "", 0);
        assertFalse(b1.hashCode() == b2.hashCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkByNullTitleField(){
        new Book(null, "", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkByNullAuthorField(){
        new Book("", null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkByNegativePriceField(){
        new Book("", "", -1);
    }
}
