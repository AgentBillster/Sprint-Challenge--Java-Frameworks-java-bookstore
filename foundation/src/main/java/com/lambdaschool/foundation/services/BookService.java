package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book save(Book book);
}
