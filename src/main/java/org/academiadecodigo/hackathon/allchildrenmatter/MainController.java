package org.academiadecodigo.hackathon.allchildrenmatter;


import org.academiadecodigo.hackathon.allchildrenmatter.UserDTO;
import org.academiadecodigo.hackathon.allchildrenmatter.UserDTOToUser;
import org.academiadecodigo.hackathon.allchildrenmatter.persistence.User;
import org.academiadecodigo.hackathon.allchildrenmatter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    private UserService userService;
    private UserDTOToUser userDTOToUser;
    private User loggedUser;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDTOToUser(UserDTOToUser userDTOToUser) {
        this.userDTOToUser = userDTOToUser;
    }

    @GetMapping(path = {"", "/"})
    public String main() {
        System.out.println("yello");
        return "mainView";
    }

    @PostMapping(path = "/welcome")
    public String showIntro(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {

        if(bindingResult.hasErrors() || !userService.authenticateUser(userDTO)){
            return "redirect:";
        }

        loggedUser = userService.save(userDTOToUser.convert(userDTO));

        return loggedUser.getLastPage();
    }

    @GetMapping(path = "/string")
    public String string() {
        return "string";
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

    @GetMapping(path = "/array")
    public String level4(){
        return "array";
    }

    @GetMapping(path = "/functionadd")
    public String level5(){
        return "functionadd";
    }

    @GetMapping(path = "/loop")
    public String level6(){
        return "loop";
    }

    @GetMapping(path = "/wrong")
    public String wrong() {
        return "wrong";
    }

    @GetMapping(path = "/mainViewStyle.css")
    public String mainViewCss(){
        return "mainViewStyle.css";
    }

    @GetMapping(path = "/stringViewStyle.css")
    public String stringViewCss(){
        return "stringViewStyle.css";
    }

}

