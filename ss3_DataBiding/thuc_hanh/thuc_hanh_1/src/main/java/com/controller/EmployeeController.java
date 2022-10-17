package com.controller;

import com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmployeeController {


    @GetMapping
    public String showForm(ModelMap model){
        model.addAttribute("employee",new Employee());
        return "/create";
    }
   @PostMapping
    public String  submit(@ModelAttribute("employee")Employee employee,ModelMap model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contractNumber",employee.getContractNumber());
        model.addAttribute("id",employee.getId());
        return "/info";
    }

//    @GetMapping
//    public String showListEmployee() {
//        return "/index";
//    }
//
//    @GetMapping("/formCreate")
//    public String createEmployeeForm(Model com.model) {
//        com.model.addAttribute("employee", new Employee());
//        return "/formCreate";
//    }
//
//    @PostMapping("/addEmployee")
//    public String addEmployee (@ModelAttribute Employee employee, RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("employeeId", employee.getId());
//        redirectAttributes.addFlashAttribute("employeeName", employee.getName());
//        redirectAttributes.addFlashAttribute("employeeContactNumber", employee.getContractNumber());
//
//        return "redirect:/index";
}
