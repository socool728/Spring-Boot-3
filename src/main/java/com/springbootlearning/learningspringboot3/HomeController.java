package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // Spring MVC's annotation to communicate that this class is Web Controller.
public class HomeController {

    record Video(String name) {} // alternative of JSON and encapsulate data for mustache template
    List<Video> videos = List.of( // assemble an immutable collection of 'Video' Objects using List.of() to make simply test data
        new Video("Need HELP with your SPRING BOOT 3 App?"),
        new Video("Don't do THIS to your own CODE!"),
        new Video("SECRETS to fix BROKEN CODE!")
    );

    @GetMapping("/") // Spring MVC's annotation to map HTTP 'GET/' calls to this method
    public String index() {
        return "index";
    }
}
