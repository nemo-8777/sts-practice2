package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TestData;
import com.example.demo.repository.TestDataRepository;

import jakarta.transaction.Transactional;

@Service
public class TestDataService {

    @Autowired
    TestDataRepository testDataRepository;

    public List<TestData> getTestDataAll() {
        return testDataRepository.findAll();
    }

    @Transactional
    public boolean insertTestData(final TestData testData) {
        testDataRepository.save(testData);
        return true;
    }
}