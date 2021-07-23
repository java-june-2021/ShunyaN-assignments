package com.shunya.show.BookServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shunya.show.models.Book;
import com.shunya.show.repositories.BookRepository;

@Service
public class BookService {
	
	// initialize the books variable with values
    private List<Book> books = new ArrayList<Book>(Arrays.asList(
            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
            ));
    
	// adding the book repository as a dependency
	private BookRepository bRepo;
	
	public BookService(BookRepository bRepo) {
		this.bRepo = bRepo;
	}
	
	//Display all Books
//	public List<Book> allBooks() {
//		return this.bRepo.findAll();
//	}
	public List<Book> allBooks() {
        return books;
    }
	
	//Create
	public Book createBook(Book book) {
		return this.bRepo.save(book);
	}
	
	//Read
	public Book getOneBook(Long id)	{
		return this.bRepo.findById(id).orElse(null);
	}
	
	//Update
	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}
	
	// Delete
	public String deleteBook(Long id) {
		this.bRepo.deleteById(id);
		return "Album " + id + " has been deleted.";
	}
	
	// retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Book findBookByIndex(int index) {
        if (index < books.size()){
            return books.get(index);
        }else{
            return null;
        }
    }
    
    public void updateBook(int id, Book book) {
        if (id < books.size()){
            books.set(id, book);
        }
    }
    
    public void destroyBook(int id) {
        if (id < books.size()){
            books.remove(id);
        }
    }

}