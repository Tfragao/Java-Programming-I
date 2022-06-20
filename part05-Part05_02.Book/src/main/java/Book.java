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
    private String author;
    private String bookTitle;
    private int numberOfPages;
    
    public Book(String authorName, String titleName, int pages ){
       this.author = authorName;
       this.bookTitle = titleName;
       this.numberOfPages = pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.bookTitle;
    }
    
    public int getPages(){
        return this.numberOfPages;
    }
    
    @Override
    public String toString(){
        return this.author + ", " + this.bookTitle + ", " + this.numberOfPages + " pages";
    }
        
}
