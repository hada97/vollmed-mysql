package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SigninController {

    @GetMapping("/")
    public void hello(){
        System.out.println("Bem vindo a API");
        return;
    }
}
