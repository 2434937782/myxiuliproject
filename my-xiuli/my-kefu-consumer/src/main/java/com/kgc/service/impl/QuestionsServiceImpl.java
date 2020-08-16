package com.kgc.service.impl;

import com.kgc.client.QuestionsFeignClient;
import com.kgc.pojo.Questions;
import com.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsFeignClient questionsFeignClient;
    @Override
    public List<Questions> getAllQuestions() {
        return questionsFeignClient.getAllQuestions();
    }

    @Override
    public Questions getQda(Integer id) {
        return questionsFeignClient.getQda(id);
    }
}
