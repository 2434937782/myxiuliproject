package com.kgc.service;

import com.kgc.mapper.QuestionsMapper;
import com.kgc.pojo.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class RestQuestionsService {

    @Autowired
    QuestionsMapper questionsMapper;

    @RequestMapping("/showQuestions")
    public List<Questions> getAllQuestions(){
        return  questionsMapper.getAllQuestions();
    }

    @RequestMapping("/showId/{id}")
    public Questions getQda (@PathVariable("id") Integer id){
        return questionsMapper.getQda(id);
    }

}
