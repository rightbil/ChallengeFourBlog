package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/author")
    public String author() {
        return "author";
    }

    @RequestMapping("/corejava")
    public String corejava() {
        return "corejava";
    }

    @RequestMapping("/oop")
    public String oop() {
        return "oop";
    }

    @RequestMapping("/htmlcssjs")
    public String htmlcssjs() {
        return "htmlcssjs";
    }

}
