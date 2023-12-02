package xyz.mosh.subr.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("now", new Date().toInstant());
        model.addAttribute("item", "Get Stuff Done");
        return "index";
    }
}
