package com.github.judymicha.controller;

import com.github.judymicha.model.Words;
import com.github.judymicha.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/snake")
public class WordsController {

    @Autowired
    private WordsService wordsService;

    // TODO : metoda, ktora przyjmie slowo od uzytkownika
    @GetMapping
    public void getWord() {

    }


}
