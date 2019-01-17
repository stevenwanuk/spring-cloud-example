package com.sven.sc.ms.bookstore.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private long id;
    private String name;
}
