package com.javaPrograms;

public class Book {
	private String author;
	private String title;
    private Integer isbn;
    private Integer numberOfPages;
    
    public String getAuthor(){
    	return author;
    }
    public void setAuthor(String author){
    	this.author=author;
    }
    
    public String getTitle()
    {
      return title;
    }
    public void setTitle(String title)
    {
      this.title = title;
    }
    
    public Integer getIsbn()
    {
      return isbn;
    }
    public void setIsbn(Integer isbn)
    {
      this.isbn = isbn;
    }
    
    public Integer getNumberOfPages()
    {
      return numberOfPages;
    }
    public void setNumberOfPages(Integer numberOfPages)
    {
      this.numberOfPages = numberOfPages;
    }
    
}
