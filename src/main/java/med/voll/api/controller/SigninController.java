package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SigninController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("Hello");
        return;
    }
}
