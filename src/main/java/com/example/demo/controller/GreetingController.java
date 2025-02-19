package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController
public class GreetingController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")
    public String greet(@RequestHeader(name = "Accept-Language", required = false) String language) {
        Locale locale = Locale.forLanguageTag(language != null ? language : "en");
        return messageSource.getMessage("welcome.message", null, locale);
    }
}
