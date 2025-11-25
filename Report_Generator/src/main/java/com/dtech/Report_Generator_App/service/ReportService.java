package com.dtech.Report_Generator_App.service;

import com.dtech.Report_Generator_App.entity.CitizensPlans;
import com.dtech.Report_Generator_App.request.SearchRequest;

import java.util.List;

public interface ReportService {

        public List<String> getPlanNames();

        public List<String> getPlanStatuses();

        public List<CitizensPlans> handleSearchRequest(SearchRequest searchRequest);

        public boolean exportExcel();

        public boolean exportPdf();
}
