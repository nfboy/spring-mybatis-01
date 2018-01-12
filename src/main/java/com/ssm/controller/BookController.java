package com.ssm.controller;

import com.ssm.entity.Book;
import com.ssm.service.BookService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/book_list")
    public String getAllBook(Model model){

        logger.info("book_list");

        List<Book> books = bookService.getAllBook();

        model.addAttribute("books", books);
        return "BookList";
    }
}
