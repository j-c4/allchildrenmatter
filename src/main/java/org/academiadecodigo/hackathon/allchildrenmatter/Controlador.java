package org.academiadecodigo.hackathon.allchildrenmatter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

   @GetMapping
    public String test (){
       return "intro";
   }

    @GetMapping(path = "/wrong")
    public String wrong(){
        return "wrong";
    }

   @GetMapping(path = "/level1")
    public String level1(){
       return "level1";
   }
    @GetMapping(path = "/level2")
    public String level2(){
        return "level2";
    }

    @GetMapping(path = "/level3")
    public String level3(){
        return "level3";
    }

    @GetMapping(path = "/level4")
    public String level4(){
        return "level4";
    }

    @GetMapping(path = "/level5")
    public String level5(){
        return "level5";
    }

    @GetMapping(path = "/level6")
    public String level6(){
        return "level6";
    }

}

