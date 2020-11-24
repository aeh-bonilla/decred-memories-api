package com.decred.memories.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ConfEvent
 */
@Component
@ConfigurationProperties(prefix = "event")
public class ConfEvent {

    private String applicationId;

    private String eventOrigin;

    public ConfEvent(){

    }

    public ConfEvent(String applicationId, String eventOrigin) {
        this.applicationId = applicationId;
        this.eventOrigin = eventOrigin;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getEventOrigin() {
        return eventOrigin;
    }

    public void setEventOrigin(String eventOrigin) {
        this.eventOrigin = eventOrigin;
    }
}