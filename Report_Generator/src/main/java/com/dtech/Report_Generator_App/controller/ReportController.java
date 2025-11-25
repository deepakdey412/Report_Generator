package com.dtech.Report_Generator_App.controller;

import com.dtech.Report_Generator_App.entity.CitizensPlans;
import com.dtech.Report_Generator_App.request.SearchRequest;
import com.dtech.Report_Generator_App.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/search")
    public String handleSearch(SearchRequest searchRequest , Model model){

        List<CitizensPlans > plansList  = reportService.handleSearchRequest(searchRequest);
        model.addAttribute("citizenPlansInfo" , plansList);
        System.out.println(searchRequest.getPlan_name());

        return "index";
    }

    @GetMapping("/")
    public String get(Model model){

        SearchRequest searchRequest = new SearchRequest();

        model.addAttribute("search", searchRequest);
        model.addAttribute("planNames", reportService.getPlanNames()); // dropdown 1
        model.addAttribute("planStatus", reportService.getPlanStatuses());// dropdown 2
        model.addAttribute("genders", List.of("Male", "Female")); // dropdown 3

        return "index";
    }
}
