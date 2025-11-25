package com.dtech.Report_Generator_App.service;


import com.dtech.Report_Generator_App.entity.CitizensPlans;
import com.dtech.Report_Generator_App.request.SearchRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService{
    @Override
    public List<String> getPlanNames() {
        return List.of();
    }

    @Override
    public List<String> getPlanStatuses() {
        return List.of();
    }

    @Override
    public List<CitizensPlans> handleSearchRequest(SearchRequest searchRequest) {
        return List.of();
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
