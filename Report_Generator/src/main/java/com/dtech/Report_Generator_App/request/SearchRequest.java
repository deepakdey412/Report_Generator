package com.dtech.Report_Generator_App.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class SearchRequest {

    private String plan_name;
    private String plan_status;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate plan_start_date;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate plan_end_date;

    public SearchRequest() {
    }

    public SearchRequest(String plan_name, String plan_status, LocalDate plan_start_date, LocalDate plan_end_date) {
        this.plan_name = plan_name;
        this.plan_status = plan_status;
        this.plan_start_date = plan_start_date;
        this.plan_end_date = plan_end_date;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_status() {
        return plan_status;
    }

    public void setPlan_status(String plan_status) {
        this.plan_status = plan_status;
    }

    public LocalDate getPlan_start_date() {
        return plan_start_date;
    }

    public void setPlan_start_date(LocalDate plan_start_date) {
        this.plan_start_date = plan_start_date;
    }

    public LocalDate getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(LocalDate plan_end_date) {
        this.plan_end_date = plan_end_date;
    }
}
