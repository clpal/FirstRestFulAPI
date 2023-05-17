package com.restfulapi.first.FirstRestFulAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //using get method and hello-world as URI
    /* @RequestMapping(method=RequestMethod.GET, path="/test") */
    @GetMapping(path="/demotest")
    public String Hello() {
        return "MR Chhote Testing Chal Rhaui";

    }


}
