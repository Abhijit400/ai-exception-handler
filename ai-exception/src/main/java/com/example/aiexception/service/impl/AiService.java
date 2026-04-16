package com.example.aiexception.service.impl;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import static com.example.aiexception.constant.PromptMessages.prompt;


@Service

public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }


    public String getFixSuggestion(String exception) {
        System.out.println(exception);
        return chatClient.prompt()
                .user(prompt+exception)
                .call()
                .content();

    }
}
