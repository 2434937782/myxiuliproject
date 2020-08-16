package com.kgc.client;

import com.kgc.pojo.Questions;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "my-provider",
        fallback = QuestionsFeignClientImpl.class)
public interface QuestionsFeignClient {
    //查询所有问题表
    @RequestMapping("/getAllQuestions")
    public List<Questions> getAllQuestions();

    @RequestMapping("/getQda/{id}")
    public Questions getQda(@PathVariable("id") Integer id);
}
