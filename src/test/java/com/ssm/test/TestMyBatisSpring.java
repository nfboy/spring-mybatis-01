package com.ssm.test;

import com.ssm.dao.BookDao;
import com.ssm.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static junit.framework.Assert.assertNotNull;

public class TestMyBatisSpring {
    @Test
    public void test(){
        //初始化容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得 bean
        BookDao bookDao = context.getBean(BookDao.class);
        //访问数据
        List<Book> books = bookDao.getAllBook();
        for(Book book : books){
            System.out.println(book.getBookName());
        }
        assertNotNull(books);
    }
}
