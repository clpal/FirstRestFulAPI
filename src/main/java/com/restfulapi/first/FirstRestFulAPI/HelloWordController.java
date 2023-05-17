package com.restfulapi.first.FirstRestFulAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    //using get method and hello-world URI

    @GetMapping(path="/Julu")
    public String helloWorld()
    {
        return "Hello JULO";
    }

    @GetMapping(path="/hello-chhote")
    public   HelloWorldBean helloWorldBean() {

        return new  HelloWorldBean("Chhote");

    }

}
