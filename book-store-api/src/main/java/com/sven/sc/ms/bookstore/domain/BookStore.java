package com.sven.sc.ms.bookstore.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookStore {
    private String owner;
    private List<Book> books;
}
