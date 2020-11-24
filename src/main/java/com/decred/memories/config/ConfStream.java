package com.decred.memories.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
@ConfigurationProperties(prefix = "stream")
public class ConfStream {

    private String aws_region;
    private String aws_accesskey;
    private String aws_secretkey;

    private String user_stream;
    private String businnes_stream;
    private String appli_stream;

    public ConfStream() {
    }

    @Override
    public String toString() {
        return new Gson().toJson(this); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the aws_region
     */
    public String getAws_region() {
        return aws_region;
    }

    /**
     * @param aws_region the aws_region to set
     */
    public void setAws_region(String aws_region) {
        this.aws_region = aws_region;
    }

    /**
     * @return the aws_accesskey
     */
    public String getAws_accesskey() {
        return aws_accesskey;
    }

    /**
     * @param aws_accesskey the aws_accesskey to set
     */
    public void setAws_accesskey(String aws_accesskey) {
        this.aws_accesskey = aws_accesskey;
    }

    /**
     * @return the aws_secretkey
     */
    public String getAws_secretkey() {
        return aws_secretkey;
    }

    /**
     * @param aws_secretkey the aws_secretkey to set
     */
    public void setAws_secretkey(String aws_secretkey) {
        this.aws_secretkey = aws_secretkey;
    }

    /**
     * @return the businnes_stream
     */
    public String getBusinnes_stream() {
        return businnes_stream;
    }

    /**
     * @param businnes_stream the businnes_stream to set
     */
    public void setBusinnes_stream(String businnes_stream) {
        this.businnes_stream = businnes_stream;
    }

    /**
     * @return the appli_stream
     */
    public String getAppli_stream() {
        return appli_stream;
    }

    /**
     * @param appli_stream the appli_stream to set
     */
    public void setAppli_stream(String appli_stream) {
        this.appli_stream = appli_stream;
    }

    /**
     * @return the user_stream
     */
    public String getUser_stream() {
        return user_stream;
    }

    /**
     * @param user_stream the user_stream to set
     */
    public void setUser_stream(String user_stream) {
        this.user_stream = user_stream;
    }

}
