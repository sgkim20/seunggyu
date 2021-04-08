package com.clvs.seunggyu.controller;

import com.clvs.seunggyu.model.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommonController {

    @GetMapping("hello")
    @ResponseBody
    public ResultModel getResultModel(@RequestParam String name, @RequestParam int age){

        ResultModel RM = new ResultModel();
        RM.setName(name);
        RM.setAge(age);
        RM.setMessage("확인되었습니다~");
        RM.setStatusCode("200 OK");
        return RM;
    }

    @GetMapping("test/get")
    @ResponseBody
    //@Slf4j
    public ResultModel testGetMethod(@RequestParam String name, @RequestParam int age){

        ResultModel RM = new ResultModel();
        RM.setName(name);
        RM.setAge(age);

        return RM;

    }

}
