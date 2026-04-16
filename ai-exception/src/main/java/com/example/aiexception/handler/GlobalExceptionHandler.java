package com.example.aiexception.handler;

import com.example.aiexception.service.impl.AiService;
import com.example.aiexception.service.impl.SlackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final AiService aiService;
    private final SlackService slackService;

    public GlobalExceptionHandler(AiService aiService, SlackService slackService) {
        this.aiService = aiService;
        this.slackService = slackService;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {

        String fullError = ex.getMessage();

        String fix = aiService.getFixSuggestion(fullError);
        System.out.println(fix);
        slackService.sendMessage("Exception: " + fullError + "\nAI Fix: " + fix);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Server is Experiencing some issue");
    }
}
