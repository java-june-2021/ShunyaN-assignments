package com.shunya.show.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shunya.show.BookServices.BookService;
import com.shunya.show.models.Book;

@RestController
public class BooksApi {
    // defining our BookService field
    private BookService bService;
    // we can initialize our BookService object in the BooksApi constructor, using Dependency Injection
    public BooksApi(BookService bService){
        this.bService = bService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bService.findBook(id);
        return book;
    }
    

    @PutMapping("/api/books/{id}")
	public void updateBook(@PathVariable("id") Long id, Book book) {
		this.bService.updateBook(book);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
       this.bService.deleteBook(id);
    }
}