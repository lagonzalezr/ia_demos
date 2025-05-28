package com.ollama.test.wtool;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;

public class OllamaChatLocalToolsModelTest {

    static String MODEL_NAME = "qwen3:latest"; // try other local ollama model names
    //static String MODEL_NAME = "gemma3:latest";
    static String BASE_URL = "http://localhost:11434"; // local ollama base url

    public static void main(String[] args) {

        System.out.println("TEST:");
        ChatModel model = OllamaChatModel.builder()
                .baseUrl(BASE_URL)
                .modelName(MODEL_NAME)
                .temperature(0.2)
                .build();

        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        var chat = AiServices.builder(Assistant.class)
               .chatModel(model)
               .chatMemory(chatMemory)
               .tools(new MathTools())
                .build();

        String chatResponse = chat.chat("hola bro, cual es el resultado de sumar 2 mas 4");

        System.out.println(chatResponse);

    }
}
