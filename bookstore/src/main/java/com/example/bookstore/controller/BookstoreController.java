package com.example.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommended")
public class BookstoreController {

    @GetMapping("/")
    public String readingList() {
        return "Dostoevsky - The Gambler, " +
                "J.R.R. Tolkien - The Lord of the Rings, " +
                "1984 - George Orwell";
    }

}
