package com.example.demo.bookstore.service;


import com.example.demo.bookstore.Book;
import com.example.demo.bookstore.dao.AdminDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService  {

    private final AdminDao adminDao;

    public Book addBook(Book book){
        return adminDao.save(book);
    }
}
