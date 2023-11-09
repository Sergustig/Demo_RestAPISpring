package com.example.demo.controller;

import com.example.demo.json.TestJSON;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class MainController {

    @ResponseBody
    @GetMapping (value = "/hello")
    public TestJSON getHelloWorld(@RequestParam String name) {
        return new TestJSON(12, "Hello, "  + name);
    }
}
