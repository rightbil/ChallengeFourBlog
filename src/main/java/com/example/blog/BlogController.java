package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/home")
    public String index() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/author")
    public String author() {
        return "author";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/corejava")
    public String corejava() {
        return "corejava";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }
    @RequestMapping("/htmlcssjs")
    public String htmlcssjs() {
        return "htmlcssjs";
    }

    @RequestMapping("/oop")
    public String oop() {
        return "oop";
    }

}
