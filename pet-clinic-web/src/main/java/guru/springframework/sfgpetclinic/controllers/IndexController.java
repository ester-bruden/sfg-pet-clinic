package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/", "index", "index.xhtml"})
    public String index(){
//  thymeleaf is going to look for a template called index
        return "index";
    }

}
