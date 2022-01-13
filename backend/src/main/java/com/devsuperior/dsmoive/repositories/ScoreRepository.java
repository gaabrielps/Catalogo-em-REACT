package com.devsuperior.dsmoive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmoive.entities.Score;
import com.devsuperior.dsmoive.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
