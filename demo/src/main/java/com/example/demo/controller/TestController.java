package com.example.demo.controller;

import com.example.demo.bean.PcaAreas;
import com.example.demo.service.PcaAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource(name = "pcaAreasServiceImpl")
    PcaAreasService pcaAreasService;

    @RequestMapping("test")
    public String test(){
        return "测试成功";
    }

    @RequestMapping("testData")
    public List<PcaAreas> getAll(){
        return pcaAreasService.getAll();
    }

}
