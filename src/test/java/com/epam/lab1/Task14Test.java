package com.epam.lab1;

import com.epam.lab1.task12.Book;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexh on 22.09.2016.
 */
public class Task14Test extends Assert {

    @Test
    public void checkClone(){
        Book book = new Book("title", "author", 0);
        Book cloneBook = null;

        try {
            cloneBook = (Book) book.clone();
        }
        catch (CloneNotSupportedException ex){
            fail(ex.getMessage());
        }

        assertTrue(book.equals(cloneBook));
        assertTrue(book != cloneBook);
    }
}
