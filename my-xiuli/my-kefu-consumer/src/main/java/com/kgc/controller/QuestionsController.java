package com.kgc.controller;

import com.kgc.pojo.Questions;
import com.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;

    @RequestMapping("/getAllQuestions")
    public List<Questions> getAllQuestions(){
          return  questionsService.getAllQuestions();
    }

    @RequestMapping("/getQda")
    public Questions getQda(Integer id){
          return  questionsService.getQda(id);
    }

}
