package com.ollama.test.simple;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
//import dev.langchain4j.agent.tool.ToolExecutor;

public class OllamaChatLocalModelTest {
    //gemma3:latest
    //static String MODEL_NAME = "qwen3:latest"; // try other local ollama model names
    static String MODEL_NAME = "gemma3:latest";
    static String BASE_URL = "http://localhost:11434"; // local ollama base url

    public static void main(String[] args) {

        System.out.println("TEST:");
        ChatModel model = OllamaChatModel.builder()
                .baseUrl(BASE_URL)
                .modelName(MODEL_NAME)
                .temperature(0.2)
                .build();

        String answer = model.chat("Hello what LLM are you?'");
        System.out.println(answer);



        ///ejercicio 2

        /*
        model = OllamaChatModel.builder()
                .baseUrl(BASE_URL)
                .modelName(MODEL_NAME)
                .responseFormat(JSON)
                .build();

        String json = model.chat("List top 10 cites in US");
        System.out.println(json);

         */
    }
}
