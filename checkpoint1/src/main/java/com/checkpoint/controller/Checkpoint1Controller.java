package com.checkpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.checkpoint.service.LogService;

@Controller
@RequestMapping("/ejercicio")
public class Checkpoint1Controller {

    @Autowired
    @Qualifier("LogService1")
    LogService logService;

    @GetMapping("/method1")
    public String method1() {
        return "redirect:method2";
    }

    @GetMapping("/method2")
    public String method2(Model model) {
        this.logService.showLog();
        model.addAttribute("mensaje", "Hola desde el servicio Checkpoint1");
        return "vista";
    }

}
