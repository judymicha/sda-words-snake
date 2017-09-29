package com.github.judymicha.service;

import com.github.judymicha.model.Words;

import java.util.List;

public interface WordsService {

    void addWord(String word);
    List<Words> findAll();
}
