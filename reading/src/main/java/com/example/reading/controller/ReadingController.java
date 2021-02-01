package com.example.reading.controller;

import com.example.reading.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadingController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }

}
