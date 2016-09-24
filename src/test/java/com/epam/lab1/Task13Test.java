package com.epam.lab1;

import com.epam.lab1.task13.ProgrammerBook;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;


public class Task13Test extends Assert {

    @Test
    public void checkEqualsByLink(){
        ProgrammerBook book = new ProgrammerBook("", "", "", 0, 0);
        assertTrue(book.equals(book));
    }

    @Test
    public void checkEqualsByNull(){
        ProgrammerBook book = new ProgrammerBook("", "", "", 0, 0);
        assertFalse(book.equals(null));
    }

    @Test
    public void checkNotEqualsByOtherClass(){
        ProgrammerBook book = new ProgrammerBook("", "", "", 0, 0);
        assertFalse(book.equals(new Color(0, 0, 0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkByNullLanguage(){
        new ProgrammerBook("", "", null, 0, 0);
    }

    @Test
    public void checkNotEqualsWithAllFields(){
        ProgrammerBook firstBook = new ProgrammerBook("", "", "", 1, 0);
        ProgrammerBook secondBook = new ProgrammerBook("", "author", "", 0, 0);
        assertFalse(firstBook.equals(secondBook));
    }

    @Test
    public void checkEqualsBooksHashcode(){
        ProgrammerBook b1 = new ProgrammerBook("", "", "", 0, 0);
        ProgrammerBook b2 = new ProgrammerBook("", "", "", 0, 0);
        assertTrue(b1.hashCode() == b2.hashCode());
    }

    @Test
    public void checkNotEqualsBooksHashcode(){
        ProgrammerBook b1 = new ProgrammerBook("", "author", "", 0, 0);
        ProgrammerBook b2 = new ProgrammerBook("", "", "", 1, 2);
        assertFalse(b1.hashCode() == b2.hashCode());
    }
}
