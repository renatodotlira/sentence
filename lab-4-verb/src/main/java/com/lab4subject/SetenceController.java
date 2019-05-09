package com.lab4subject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetenceController {

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public String getWord(){
        System.out.println("método acessado ");
        String[] wordArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[i];
    }

}
