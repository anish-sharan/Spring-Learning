package com.example.demo.bootstrap;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData  implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author Anish  = new Author("Anish","Sharan");
        Book books = new Book("Book name","Book name 1");

        Anish.getBooks().add(books);
        books.getAuthors().add(Anish);

        authorRepository.save(Anish);
        bookRepository.save(books);

        Author Anish1  = new Author("Anish1","Sharan1");
        Book books1 = new Book("Book name@","Book name 1@");

        Anish1.getBooks().add(books);
        books1.getAuthors().add(Anish1);


        System.out.println("Started bootstrap");
        System.out.println("Number of books " + bookRepository.count());
    }

}
