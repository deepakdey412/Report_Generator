package com.dtech.Report_Generator_App.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "CITIZENS_PLANS_INFO")
public class CitizensPlans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String citizen_name;
    private String gender;
    private String plan_name;
    private String plan_status;
    private LocalDate plan_start_date;
    private LocalDate plan_end_date;
    private Double benefit_amount;
    private String denial_reason;
    private LocalDate terminate_date;
    private String terminate_reason;

    public CitizensPlans() {
    }

    public CitizensPlans(Integer id, String citizen_name, String gender, String plan_name, String plan_status, LocalDate plan_start_date, LocalDate plan_end_date, Double benefit_amount, String denial_reason, LocalDate terminate_date, String terminate_reason) {
        this.id = id;
        this.citizen_name = citizen_name;
        this.gender = gender;
        this.plan_name = plan_name;
        this.plan_status = plan_status;
        this.plan_start_date = plan_start_date;
        this.plan_end_date = plan_end_date;
        this.benefit_amount = benefit_amount;
        this.denial_reason = denial_reason;
        this.terminate_date = terminate_date;
        this.terminate_reason = terminate_reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCitizen_name() {
        return citizen_name;
    }

    public void setCitizen_name(String citizen_name) {
        this.citizen_name = citizen_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Double getBenefit_amount() {
        return benefit_amount;
    }

    public void setBenefit_amount(Double benefit_amount) {
        this.benefit_amount = benefit_amount;
    }

    public String getDenial_reason() {
        return denial_reason;
    }

    public void setDenial_reason(String denial_reason) {
        this.denial_reason = denial_reason;
    }

    public LocalDate getTerminate_date() {
        return terminate_date;
    }

    public void setTerminate_date(LocalDate terminate_date) {
        this.terminate_date = terminate_date;
    }

    public String getTerminate_reason() {
        return terminate_reason;
    }

    public void setTerminate_reason(String  terminate_reason) {
        this.terminate_reason = terminate_reason;
    }
}
