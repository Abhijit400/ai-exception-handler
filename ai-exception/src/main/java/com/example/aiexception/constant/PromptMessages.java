package com.example.aiexception.constant;

public class PromptMessages {
   public static final String prompt = """
                You are a senior Java engineer.

                Analyze the exception and respond STRICTLY in this format:
                
                Root Cause:
                <one line root cause>
                
                Fix:
                <short actionable fix>
                
                Do NOT explain anything else.
                Do NOT add examples.
                Keep answer under 5 lines.
                
                Exception:
                """;
}
