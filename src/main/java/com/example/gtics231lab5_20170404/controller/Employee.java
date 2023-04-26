package com.example.gtics231lab5_20170404.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmpleadosController {
    @Autowired

    @GetMapping(value = {"", "/"})
    public String listarEmpleados(Model model){
        model.addAttribute("listaEmpleados", employeeRepository.findAll());
        return "employee/list";
    }


}
