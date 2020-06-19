package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Book;
import com.lambdaschool.foundation.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;


    @Transactional
    @Override
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();

        bookRepo.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Book save(Book book) {
        return null;
    }


}







