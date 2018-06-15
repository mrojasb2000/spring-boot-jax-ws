package org.example.base;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component(value = "greetingService")
@WebService
public class GreetingService {

    @WebMethod
    public String greeting() {
        return "Hello World!";
    }
}