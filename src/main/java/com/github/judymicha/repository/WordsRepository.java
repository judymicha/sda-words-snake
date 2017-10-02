package com.github.judymicha.repository;

import com.github.judymicha.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordsRepository extends JpaRepository<Words, Long> {

    Words findFirstByOrderByTimeDesc();

}
