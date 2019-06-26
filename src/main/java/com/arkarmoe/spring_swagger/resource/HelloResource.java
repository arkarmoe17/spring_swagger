package com.arkarmoe.spring_swagger.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resource",description = "Hello-Resource")
public class HelloResource {

    @GetMapping
    @ApiOperation(value = "Hello World")
    public String hello(){
        return "Hello World.";
    }
}
