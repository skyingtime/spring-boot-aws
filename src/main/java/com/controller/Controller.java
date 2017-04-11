package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangliu on 11/04/2017.
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping(value = "email/{params}", method = RequestMethod.GET)
    public String myAPI(@PathVariable String params) {
        return "Hello " + params;
    }
}
