package org.academiadecodigo.hackathon.allchildrenmatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping
    public String test() {
        return "mainView";
    }

    @GetMapping(path = "/intro")
    public String showIntro() {
        return "intro";
    }

    @GetMapping(path = "/level1")
    public String test2() {
        return "level1";
    }

    @GetMapping(path = "/wrong")
    public String wrong() {
        return "wrong";
    }
}

