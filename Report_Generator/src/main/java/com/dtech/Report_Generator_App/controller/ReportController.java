package com.dtech.Report_Generator_App.controller;

import com.dtech.Report_Generator_App.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/")
    public String get(){
        return "Deepalk";
    }

}
