/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/signin")
    public String login() {
        return "signin";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }

    @RequestMapping("/QLKL")
    public String QLKL() {
        return "QLKL";
    }

    @RequestMapping("/QLSV")
    public String QLSV() {
        return "QLSV";
    }

    @RequestMapping("/QLGV")
    public String QLGV() {
        return "QLGV";
    }

    @RequestMapping("/QLDT")
    public String QLDT() {
        return "QLDT";
    }

    @RequestMapping("/QLHDBV")
    public String QLHDBV() {
        return "QLHDBV";
    }
}
