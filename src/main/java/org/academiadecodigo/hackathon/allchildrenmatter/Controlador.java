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
    public String mainCss(){
        return "mainViewStyle.css";
    }

    @GetMapping(path = "/string")
    public String showIntro() {
        return "string1";
    }

    @GetMapping(path = "/wrong")
    public String wrong() {
        return "wrong";
    }

   @GetMapping(path = "/boolean")
    public String level1(){
       return "boolean2";
   }

    @GetMapping(path = "/operators")
    public String level2(){
        return "operators";
    }

    @GetMapping(path = "/level2.js")
    public String level2JS() {
       return "level2.js";
    }

    @GetMapping(path = "/languagejs")
    public String level3(){
        return "languagejs3";
    }

    @GetMapping(path = "/array")
    public String level4(){
        return "array4";
    }

    @GetMapping(path = "/functionadd")
    public String level5(){
        return "functionadd5";
    }

    @GetMapping(path = "/loop")
    public String level6(){
        return "loop6";
    }

    @GetMapping(path = "/outsystems")
    public String outsystems(){
        return "outsystems";
    }

    @GetMapping(path = "/final")
    public String goodbye(){
        return "final";
    }

    @GetMapping(path = "/main.css")
    public String arrayCss(){
        return "main.css";
    }


    @GetMapping(path = "/background.png")
    public String background(){
        return "background.png";
    }


}

