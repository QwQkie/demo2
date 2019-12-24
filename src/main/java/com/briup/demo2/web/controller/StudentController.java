package com.briup.demo2.web.controller;

import com.briup.demo2.bean.MessageUtil;
import com.briup.demo2.bean.Student;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.demo2.bean.Message;
import sun.misc.MessageUtils;
import sun.plugin2.message.Serializer;

import java.io.IOException;
import java.util.Date;

@RestController

public class StudentController {

//    @PostMapping("/add")
//    public Message add(){
//        Message<String> message =new Message<>();
//        Date date = new Date();
//        message.setTime(date.getTime());
//    message.setStatus(200);
//    message.setMessage("success");
//    message.setData("添加学生成功");
//    return message;
//
//}

    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    public Message add(Student student){
        return MessageUtil.success("添加成功");
    }


    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")
   @ApiImplicitParams({

           @ApiImplicitParam(name = "stuid",value = "学号",paramType = "query",dataType = "int"),
           @ApiImplicitParam(name = "name",value = "姓名",paramType = "query",dataType = "string")
   })
    public Message delete(int stuid,String name){
        return MessageUtil.success("删除成功");
}


}
