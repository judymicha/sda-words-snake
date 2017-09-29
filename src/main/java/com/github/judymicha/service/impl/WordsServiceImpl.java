package com.github.judymicha.service.impl;

import com.github.judymicha.model.Words;
import com.github.judymicha.repository.WordsRepository;
import com.github.judymicha.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class WordsServiceImpl implements WordsService{

    @Autowired
    private WordsRepository wordsRepository;

    @Override
    public void addWord(String word) {

        wordsRepository.save(wordsRepository.findOneByOrder());
        // TODO: zapiswaynie slowa do bazy gdy pasuje do domina
    }

    @Override
    public List<Words> findAll() {
        //TODO: wyswietlamy wszystkie slowa w kolejnosci dodania
        return wordsRepository.findAll();
    }
}
