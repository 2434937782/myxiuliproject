package com.kgc.client;

import com.kgc.pojo.Questions;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class QuestionsFeignClientImpl implements QuestionsFeignClient{
    @Override
    public List<Questions> getAllQuestions() {
        return null;
    }

    @Override
    public Questions getQda(Integer id) {
        return null;
    }
}
