package com.mysite.ssb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Question, Integer>{

}
