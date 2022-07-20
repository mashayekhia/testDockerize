package man.ir.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class TestController {

    @GetMapping("/message")
    public String message() {
        return "Hello Dockerized Project";
    }
}
