package com.example.aiexception.service.impl;

import com.example.aiexception.requestDTO.TestRequest;
import com.example.aiexception.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TestServiceImpl implements TestService {
    public String error() {
        int x = 10 / 0;
        return "ok";
    }

    public String error(@RequestBody TestRequest request) {

        switch (request.getId()) {

            case 1:
                if (request.getId() == null || request.getId() >= 1000) {
                    throw new IllegalArgumentException("Invalid user ID, id must be less than 1000: " + request.getId());
                }
                break;

            case 2:
                String name = request.getName();

                if (name == null || name.isEmpty()) {
                    throw new IllegalArgumentException("Name cannot be null or empty");
                }

                if (!Character.isUpperCase(name.charAt(0))) {
                    throw new RuntimeException("Name must start with a capital letter: " + name);
                }
                break;

            default:
        }

        return "Success";
    }
}
