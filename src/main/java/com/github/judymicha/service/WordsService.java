package com.github.judymicha.service;

import java.util.List;

public interface WordsService {

    void addWord(String word);
    List<String> findAllWords();
}
