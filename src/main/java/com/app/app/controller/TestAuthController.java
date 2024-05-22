package com.app.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/method")
//@PreAuthorize("denyAll()")
public class TestAuthController {

    @GetMapping("/get")
//    @PreAuthorize("hasAuthority('READ')")
    public String helloGet(){
        return "Hello World - GET";
    }

    @PostMapping("/post")
//    @PreAuthorize("hasAuthority('CREATE')")
    public String helloPost(){
        return "Hello World - POST";
    }

    @PutMapping("/put")
//    @PreAuthorize("hasAuthority('READ') or hasAuthority('CREATE')")
    public String helloPut(){
        return "Hello World - PUT";
    }

    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello World - DELETE";
    }

    @PatchMapping("/patch")
    public String helloPatch(){
        return "Hello World - PATCH";
    }
}
