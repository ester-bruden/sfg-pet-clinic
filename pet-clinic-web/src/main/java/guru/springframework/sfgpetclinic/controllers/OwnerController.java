package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// Anoother way to use @RequestMaping, we put as a  class annotation with /owners as a parameter  and I can remove this part of the path in the method annotation @RequestMapping, this way /owner is going to be prefix to the other paths
@RequestMapping({"/owners"})
@Controller
public class OwnerController {
    @RequestMapping({"/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
