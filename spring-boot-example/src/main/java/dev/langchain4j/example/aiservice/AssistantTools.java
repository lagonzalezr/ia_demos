package dev.langchain4j.example.aiservice;

import dev.langchain4j.agent.tool.Tool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class AssistantTools {
    private static final Logger log = LoggerFactory.getLogger(AssistantTools.class);
    /**
     * This tool is available to {@link Assistant}
     */
    @Tool
    public String currentTime() {
        log.info("toolUsed: currentTime()");
        return LocalTime.now().toString();
    }
}
