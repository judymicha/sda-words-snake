package com.github.judymicha.service.impl;

import com.github.judymicha.model.Words;
import com.github.judymicha.repository.WordsRepository;
import com.github.judymicha.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Service
public class WordsServiceImpl implements WordsService{

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public void addWord(String newWord) {

        String firstLetterOfNewWord = newWord.substring(0,1);

        Words word = new Words();
        word.setSnakePiece(newWord);
        word.setTime(LocalDateTime.now());

        if(wordsRepository.findAll().isEmpty()) {
            wordsRepository.save(word);
        } else if(wordsRepository.findFirstByOrderByTimeDesc().getSnakePiece().endsWith(firstLetterOfNewWord)) {
            wordsRepository.save(word);
        } else {
            throw new RuntimeException("The word does not match to our domino");
        }
    }

    @Override
    public List<String> findAll() {
        return wordsRepository.findAll().stream()
            .sorted(comparing(Words::getTime))
            .map(Words::getSnakePiece)
            .collect(Collectors.toList());
    }
}
