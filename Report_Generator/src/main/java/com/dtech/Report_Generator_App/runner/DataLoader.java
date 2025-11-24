package com.dtech.Report_Generator_App.runner;

import com.dtech.Report_Generator_App.repository.CitizenPlansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CitizenPlansRepository citizenPlansRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
