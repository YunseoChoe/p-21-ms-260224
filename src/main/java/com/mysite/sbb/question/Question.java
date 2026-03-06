package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // 질문에서 답변 참조
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // mappedBy = 참조 엔티티의 속성명, cascade = 질문을 삭제하면 그에 달린 답변들도 모두 삭제
    private List<Answer> answerList;
}
