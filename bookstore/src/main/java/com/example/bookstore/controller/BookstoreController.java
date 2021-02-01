package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreController {

    @RequestMapping("/recommended")
    public String readingList() {
        return "Dostoevsky - The Gambler, " +
                "J.R.R. Tolkien - The Lord of the Rings, " +
                "George Orwell - 1984";
    }

}
