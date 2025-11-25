package com.dtech.Report_Generator_App.service;


import com.dtech.Report_Generator_App.entity.CitizensPlans;
import com.dtech.Report_Generator_App.repository.CitizenPlansRepository;
import com.dtech.Report_Generator_App.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private CitizenPlansRepository citizenPlansRepository;

    @Override
    public List<String> getPlanNames() {
       List<String> plansList = citizenPlansRepository.getPlansNames();
       return plansList;
    }

    @Override
    public List<String> getPlanStatuses() {
        List<String> statusList= citizenPlansRepository.getPlansStatus();
        return statusList;
    }

    @Override
    public List<CitizensPlans> handleSearchRequest(SearchRequest searchRequest) {
        List<CitizensPlans> citizensPlansList = citizenPlansRepository.findAll();
        return citizensPlansList;
    }

    @Override
    public boolean exportExcel() {
        return false;
    }

    @Override
    public boolean exportPdf() {
        return false;
    }
}
