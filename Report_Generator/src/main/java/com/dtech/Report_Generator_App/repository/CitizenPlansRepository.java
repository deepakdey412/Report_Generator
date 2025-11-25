package com.dtech.Report_Generator_App.repository;

import com.dtech.Report_Generator_App.entity.CitizensPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CitizenPlansRepository extends JpaRepository<CitizensPlans , Integer> {

    @Query("select distinct(plan_name) from CitizensPlans ")
    public List<CitizensPlans> getPlansNames();

    @Query("select distinct(plan_status) from CitizensPlans ")
    public List<CitizensPlans> getPlansStatus();
}
