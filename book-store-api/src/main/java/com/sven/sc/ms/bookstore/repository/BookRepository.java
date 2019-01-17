package com.sven.sc.ms.bookstore.repository;

import com.sven.sc.ms.bookstore.domain.Book;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<Book>();

    @PostConstruct
    public void init() {
        books.add(Book.builder().id(0l).name("book 0").build());
        books.add(Book.builder().id(1l).name("book 1").build());
        books.add(Book.builder().id(2l).name("book 2").build());
        books.add(Book.builder().id(3l).name("book 3").build());
        books.add(Book.builder().id(4l).name("book 4").build());
    }

    public List<Book> getAll() {

        return this.books;
    }
}
