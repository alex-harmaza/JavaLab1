package com.epam.lab1.task13;

import com.epam.lab1.task12.Book;


public class ProgrammerBook extends Book {

    private String language;
    private int level;


    public ProgrammerBook(String title, String author, String language, int price, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null){
            return false;
        }
        if (object.getClass() != this.getClass()){
            return false;
        }
        if (!super.equals(object)){
            return false;
        }

        ProgrammerBook that = (ProgrammerBook) object;

        if (language != null && !language.equals(that.language)){
            return false;
        }
        if (level != that.level){
            return false;
        }
        if (language != that.language){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode() * 17;
        if (language != null){
            result = result + language.hashCode();
        }
        result = result * 37 + level;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (language != null){
            builder.append("\n\tlanguage: ").append(language);
        }
        builder.append("\n\tlevel: ").append(level);
        return builder.toString();
    }
}
