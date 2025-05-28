package com.ollama.test.wtool;

import dev.langchain4j.agent.tool.Tool;

public class MathTools {
    @Tool("calculate the sum of 2 numbers")
    public int add(int a, int b) {
        System.out.println("use la suma xD");
        return a + b;
    }

    @Tool
    public int subtract(int a, int b) {
        return a - b;
    }
}
