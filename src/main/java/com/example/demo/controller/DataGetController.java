package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TestData;
import com.example.demo.service.TestDataService;

@RestController
public class DataGetController {

    @Autowired
    TestDataService testDataService;

    @RequestMapping(value = "/api/data/get", method = RequestMethod.GET)
    public List<TestData> doGet() throws Exception {
        return testDataService.getTestDataAll();
    }
}

