package com.kgc.mapper;

import com.kgc.pojo.Questions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionsMapper {
    //查询所有问题表
    public List<Questions> getAllQuestions();
    //根据id查询问题回答
    public Questions getQda(Integer id);

}
