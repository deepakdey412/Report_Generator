package com.dtech.Report_Generator_App.runner;

import com.dtech.Report_Generator_App.entity.CitizensPlans;
import com.dtech.Report_Generator_App.repository.CitizenPlansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CitizenPlansRepository citizenPlansRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        citizenPlansRepository.deleteAll();

        // ==================== FOOD SCHEME ====================

// Approved
        CitizensPlans food1 = new CitizensPlans();
        food1.setCitizen_name("Rahul Kumar");
        food1.setGender("Male");
        food1.setPlan_name("Food Scheme");
        food1.setPlan_status("APPROVED");
        food1.setPlan_start_date(LocalDate.now());
        food1.setPlan_end_date(LocalDate.now().plusMonths(12));
        food1.setBenefit_amount(2000.0);

// Denied
        CitizensPlans food2 = new CitizensPlans();
        food2.setCitizen_name("Priya Kumari");
        food2.setGender("Female");
        food2.setPlan_name("Food Scheme");
        food2.setPlan_status("DENIED");
        food2.setPlan_start_date(LocalDate.now());
        food2.setPlan_end_date(LocalDate.now().plusMonths(12));
        food2.setBenefit_amount(0.0);
        food2.setDenial_reason("Income criteria not matched");

// Terminated
        CitizensPlans food3 = new CitizensPlans();
        food3.setCitizen_name("Aman Singh");
        food3.setGender("Male");
        food3.setPlan_name("Food Scheme");
        food3.setPlan_status("TERMINATED");
        food3.setPlan_start_date(LocalDate.now().minusMonths(3));
        food3.setPlan_end_date(LocalDate.now().plusMonths(9));
        food3.setBenefit_amount(800.0);
        food3.setTerminate_date(LocalDate.now());
        food3.setTerminate_reason("Duplicate ration card");


// ==================== MEDICAL SCHEME ====================

// Approved
        CitizensPlans med1 = new CitizensPlans();
        med1.setCitizen_name("Sunita Devi");
        med1.setGender("Female");
        med1.setPlan_name("Medical Scheme");
        med1.setPlan_status("APPROVED");
        med1.setPlan_start_date(LocalDate.now());
        med1.setPlan_end_date(LocalDate.now().plusMonths(8));
        med1.setBenefit_amount(100000.0);

// Denied
        CitizensPlans med2 = new CitizensPlans();
        med2.setCitizen_name("Arjun Mehta");
        med2.setGender("Male");
        med2.setPlan_name("Medical Scheme");
        med2.setPlan_status("DENIED");
        med2.setPlan_start_date(LocalDate.now());
        med2.setPlan_end_date(LocalDate.now().plusMonths(8));
        med2.setBenefit_amount(0.0);
        med2.setDenial_reason("No valid medical documents");

// Terminated
        CitizensPlans med3 = new CitizensPlans();
        med3.setCitizen_name("Ramesh Gupta");
        med3.setGender("Male");
        med3.setPlan_name("Medical Scheme");
        med3.setPlan_status("TERMINATED");
        med3.setPlan_start_date(LocalDate.now().minusMonths(2));
        med3.setPlan_end_date(LocalDate.now().plusMonths(10));
        med3.setBenefit_amount(20000.0);
        med3.setTerminate_date(LocalDate.now());
        med3.setTerminate_reason("Fake medical certificate");


// ==================== CASH SCHEME ====================

// Approved
        CitizensPlans cash1 = new CitizensPlans();
        cash1.setCitizen_name("Meera Sharma");
        cash1.setGender("Female");
        cash1.setPlan_name("Cash Scheme");
        cash1.setPlan_status("APPROVED");
        cash1.setPlan_start_date(LocalDate.now());
        cash1.setPlan_end_date(LocalDate.now().plusMonths(3));
        cash1.setBenefit_amount(5000.0);

// Denied
        CitizensPlans cash2 = new CitizensPlans();
        cash2.setCitizen_name("Nikhil Jain");
        cash2.setGender("Male");
        cash2.setPlan_name("Cash Scheme");
        cash2.setPlan_status("DENIED");
        cash2.setPlan_start_date(LocalDate.now());
        cash2.setPlan_end_date(LocalDate.now().plusMonths(3));
        cash2.setBenefit_amount(0.0);
        cash2.setDenial_reason("Bank account not linked");

// Terminated
        CitizensPlans cash3 = new CitizensPlans();
        cash3.setCitizen_name("Jyoti Verma");
        cash3.setGender("Female");
        cash3.setPlan_name("Cash Scheme");
        cash3.setPlan_status("TERMINATED");
        cash3.setPlan_start_date(LocalDate.now().minusMonths(1));
        cash3.setPlan_end_date(LocalDate.now().plusMonths(5));
        cash3.setBenefit_amount(2000.0);
        cash3.setTerminate_date(LocalDate.now());
        cash3.setTerminate_reason("Multiple scheme benefits detected");


// ==================== TRAVEL SCHEME ====================

// Approved
        CitizensPlans travel1 = new CitizensPlans();
        travel1.setCitizen_name("Dinesh Yadav");
        travel1.setGender("Male");
        travel1.setPlan_name("Travel Scheme");
        travel1.setPlan_status("APPROVED");
        travel1.setPlan_start_date(LocalDate.now());
        travel1.setPlan_end_date(LocalDate.now().plusMonths(4));
        travel1.setBenefit_amount(1500.0);

// Denied
        CitizensPlans travel2 = new CitizensPlans();
        travel2.setCitizen_name("Rekha Joshi");
        travel2.setGender("Female");
        travel2.setPlan_name("Travel Scheme");
        travel2.setPlan_status("DENIED");
        travel2.setPlan_start_date(LocalDate.now());
        travel2.setPlan_end_date(LocalDate.now().plusMonths(4));
        travel2.setBenefit_amount(0.0);
        travel2.setDenial_reason("Not using public transport");

// Terminated
        CitizensPlans travel3 = new CitizensPlans();
        travel3.setCitizen_name("Rajendra Patel");
        travel3.setGender("Male");
        travel3.setPlan_name("Travel Scheme");
        travel3.setPlan_status("TERMINATED");
        travel3.setPlan_start_date(LocalDate.now().minusMonths(2));
        travel3.setPlan_end_date(LocalDate.now().plusMonths(6));
        travel3.setBenefit_amount(700.0);
        travel3.setTerminate_date(LocalDate.now());
        travel3.setTerminate_reason("False travel bills");

        //Save all the citizens(objects of citizens information)
        citizenPlansRepository.saveAll(Arrays.asList(
                food1, food2, food3,
                med1, med2, med3,
                cash1, cash2, cash3,
                travel1, travel2, travel3
        ));

    }
}
