package org.academiadecodigo.hackathon.allchildrenmatter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping
    public String test() {
        return "mainView";
    }

    @GetMapping(path = "/string")
    public String showIntro() {
        return "string";
    }

    @GetMapping(path = "/wrong")
    public String wrong() {
        return "wrong";
    }

   @GetMapping(path = "/boolean")
    public String level1(){
       return "boolean";
   }
    @GetMapping(path = "/operators")
    public String level2(){
        return "operators";
    }

    @GetMapping(path = "/languagejs")
    public String level3(){
        return "languagejs";
    }

    @GetMapping(path = "/mainViewStyle.css")
    public String css(){
        return "mainViewStyle.css";
    }

    @GetMapping(path = "/array")
    public String level4(){
        return "array";
    }

    @GetMapping(path = "/functionadd")
    public String level5(){
        return "functionadd";
    }

    @GetMapping(path = "/level6")
    public String level6(){
        return "level6";
    }

}

