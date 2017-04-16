package com.service.email;

/**
 * Created by yangliu on 16/04/2017.
 */
public interface EmailService {
    public void sendSimpleMessage(String from, String to, String subject, String text);
}
