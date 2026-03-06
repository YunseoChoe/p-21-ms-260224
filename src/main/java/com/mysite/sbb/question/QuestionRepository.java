package com.mysite.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); // 메서드명을 분석하여 자동으로 쿼리를 만들어줌.
    Question findBySubjectAndContent(String subject, String content);
}
