package com.lambdaschool.foundation.services;

import com.lambdaschool.foundation.models.Author;
import com.lambdaschool.foundation.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "authorService")
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepo authorrepo;


    @Transactional
    @Override
    public List<Author> getAllAuthors() {
        List<Author> list = new ArrayList<>();

        authorrepo.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Author save(Author author) {
        return null;
    }
}
