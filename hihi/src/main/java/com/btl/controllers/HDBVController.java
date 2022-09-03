package com.btl.controllers;

import com.btl.service.HDBVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ManhHuy
 */
@Controller
public class HDBVController {

    @Autowired
    private HDBVService categoryService;

    @ModelAttribute
    public void commonAttr(Model model) {
        model.addAttribute("Hdbv", this.categoryService.getHdbvs());
    }
}
