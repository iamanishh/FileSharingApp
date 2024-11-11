package com.Filesharing.Project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/files")
public class FileController {
    @GetMapping("/files")
    public String login(){
        return "home";
    }

    @GetMapping("/list")
    public String files(){
        return "list files";
    }

    @GetMapping("/share")
    public String share(){
        return "shared_files";
    }
}
