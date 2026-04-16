package com.example.aiexception.controller;

import com.example.aiexception.requestDTO.TestRequest;
import com.example.aiexception.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/error")
    public String error() {
        return testService.error();
    }

    @PostMapping("/error/v2")
        public String error(@RequestBody TestRequest request) {
        return testService.error(request);
    }
}
