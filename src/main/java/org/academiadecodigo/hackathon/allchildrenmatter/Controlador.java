package org.academiadecodigo.hackathon.allchildrenmatter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping
    public String test() {
        return "mainView";
    }

    @GetMapping(path = "/mainViewStyle.css")
    public String mainCss() {
        return "mainViewStyle.css";
    }

    @GetMapping(path = "/wrong")
    public String wrong() {
        return "wrong";
    }

    @GetMapping(path = "/string")
    public String level1() {
        return "string1";
    }

    @GetMapping(path = "/boolean")
    public String level2() {
        return "boolean2";
    }

    @GetMapping(path = "/languagejs")
    public String level3() {
        return "languagejs3";
    }

    @GetMapping(path = "/operator")
    public String level4() {
        return "operator4";
    }

    @GetMapping(path = "/operator4.js")
    public String level4js() {
        return "operator4.js";
    }

    @GetMapping(path = "/array")
    public String level5() {
        return "array5";
    }

    @GetMapping(path = "/functionadd")
    public String level6() {
        return "functionadd6";
    }

    @GetMapping(path = "/loop")
    public String level7() {
        return "loop7";
    }

    @GetMapping(path = "/outsystems")
    public String outsystems() {
        return "outsystems";
    }

    @GetMapping(path = "/final")
    public String goodbye() {
        return "final";
    }

    @GetMapping(path = "/main.css")
    public String arrayCss() {
        return "main.css";
    }
}

