package com.kgc.service;

import com.kgc.pojo.Questions;

import java.util.List;

public interface QuestionsService {
    //查询所有问题表
    public List<Questions> getAllQuestions();
    //根据id查询问题回答
    public Questions getQda(Integer id);
}
