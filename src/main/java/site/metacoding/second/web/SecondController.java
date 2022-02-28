package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    // Read - select
    @GetMapping("/test1")
    public String test1() {
        return "<h1>test1</h1>";
    }

    // Create - insert
    @PostMapping("/test2")
    public String test2() {
        return "<h1>test2</h1>";
    }

    // update
    @PutMapping("/test3")
    public String test3() {
        return "<h1>test3</h1>";
    }

    @DeleteMapping("/test4")
    public String test4() {
        return "<h1>test4</h1>";
    }
}
