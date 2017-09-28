package com.github.judymicha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Words {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String snakePiece;
    private LocalDateTime time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSnakePiece() {
        return snakePiece;
    }

    public void setSnakePiece(String snakePiece) {
        this.snakePiece = snakePiece;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
