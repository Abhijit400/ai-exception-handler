package com.example.aiexception.service;

import com.example.aiexception.requestDTO.TestRequest;

public interface TestService {
    String error();
    String error(TestRequest testRequest);
}
