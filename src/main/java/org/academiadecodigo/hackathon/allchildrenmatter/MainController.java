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

    @GetMapping(path="/concepts")
    public String concept(){
        return "concepts";
    }

}

