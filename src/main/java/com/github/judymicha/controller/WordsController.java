package com.github.judymicha.controller;

import com.github.judymicha.model.Words;
import com.github.judymicha.repository.WordsRepository;
import com.github.judymicha.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snake")
public class WordsController {

    @Autowired
    private WordsService wordsService;

    @PostMapping("/add-word")
    public void addWord (@RequestParam String word) {
        wordsService.addWord(word);
    }

    @GetMapping
    public List<String> findAll() {
        return wordsService.findAll();
    }


}
