package app.invoice.management.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

//    ADMIN
    @GetMapping("admin/dashboard")
    public String dashboard(){
        return "admin/dashboard";
    }

    @GetMapping("admin/users")
    public String users(){
        return "admin/users";
    }

    @GetMapping("vr-staff/user")
    public String vr(){
        return "vr";
    }

}
