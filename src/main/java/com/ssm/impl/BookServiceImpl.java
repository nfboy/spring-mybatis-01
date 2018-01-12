package com.ssm.impl;

import com.ssm.service.BookService;
import com.ssm.dao.BookDao;
import com.ssm.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookDao bookDao;
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
