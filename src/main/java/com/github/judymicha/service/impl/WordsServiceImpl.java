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
        // zapiswaynie slowa do bazy gdy pasuje do domina
        Words word = new Words();
        word.setSnakePiece(newWord);
        word.setTime(LocalDateTime.now());
        wordsRepository.save(word);
    }

    @Override
    public List<String> findAll() {
        //wyswietlamy wszystkie slowa w kolejnosci dodania
        return wordsRepository.findAll().stream()
            .sorted(comparing(Words::getTime))
            .map(Words::getSnakePiece)
            .collect(Collectors.toList());
    }
}
