package com.example.demo.bookstore.service;


import com.example.demo.bookstore.Book;
import com.example.demo.bookstore.dao.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookDao bookDao;

    public Book saveBook(){
        return bookDao.save(new Book( 1,"Mortal Instrument", "SuperNatural", 25.0F, "idk", "J.D"));
    }
}
