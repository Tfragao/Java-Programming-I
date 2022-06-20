/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyson
 */
public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;
    
    public Book(String bookTitle, int pages, int year){
        this.title = bookTitle;
        this.numberOfPages = pages;
        this.publicationYear = year;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.numberOfPages;
    }
    
    public int getYear(){
        return this.publicationYear;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }
}
