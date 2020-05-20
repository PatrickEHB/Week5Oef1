package be.ehb.oef1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showIndex() {

        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String showAbout() {

        return "about";

    }
}
