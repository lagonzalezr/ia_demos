package com.ollama.test.wtool;

import dev.langchain4j.service.SystemMessage;

public interface Assistant {
    @SystemMessage({
            "You are a calculator agent that answer in slang."
    })
    String chat(String userMessage);
}
