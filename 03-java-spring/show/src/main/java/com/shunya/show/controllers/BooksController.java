package com.shunya.show.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shunya.show.BookServices.BookService;
import com.shunya.show.models.Book;

@Controller
public class BooksController {
 private final BookService bService;
 
 public BooksController(BookService bookService) {
     this.bService = bookService;
 }
 
 @RequestMapping("/books")
 public String index(Model model) {
     List<Book> books = bService.allBooks();
     model.addAttribute("books", books);
     return "/books/index.jsp";
 }
 
 @RequestMapping("/books/{index}")
 public String findBookByIndex(Model model, @PathVariable("index") int index) {
     Book book = bService.findBookByIndex(index);
     model.addAttribute("book", book);
     return "showBook.jsp";
 }
 
 @RequestMapping("/books/new")
 public String newBook(@ModelAttribute("book") Book book) {
     return "/books/new.jsp";
 }
 @RequestMapping(value="/books", method=RequestMethod.POST)
 public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
     if (result.hasErrors()) {
         return "/books/new.jsp";
     } else {
         bService.createBook(book);
         return "redirect:/books";
     }
}

 @PostMapping("/books/edit/{id}")
 public String updateBook(@PathVariable("id") int id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
     if (result.hasErrors()) {
         return "editBook.jsp";
     }else{
         bService.updateBook(id, book);
         return "redirect:/books";
     }
}
 
 @RequestMapping(value="/books/delete/{id}")
 public String destroyBook(@PathVariable("id") int id) {
     bService.destroyBook(id);
     return "redirect:/books";
 }


}