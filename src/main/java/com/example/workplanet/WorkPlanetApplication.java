package com.example.workplanet;

import com.example.workplanet.entities.AppUser;
import com.example.workplanet.entities.JobPost;
import com.example.workplanet.repositories.AppUserRepository;
import com.example.workplanet.repositories.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WorkPlanetApplication implements CommandLineRunner {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    JobPostRepository jobPostRepository;

    public static void main(String[] args) {
        SpringApplication.run(WorkPlanetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser MustiG = new AppUser("MustiG", "pass");
        AppUser TimG = new AppUser("TimG", "pass");
        appUserRepository.saveAll(List.of(MustiG, TimG));

        JobPost jobPost = new JobPost
                ("Programmera", "Java utvecklare", "Fullstack", "Hörby", TimG);

        JobPost jobPost1 = new JobPost
                ("Missbrukare", "Kanyl expert", "Helt slut", "Rosengård", MustiG);

        jobPostRepository.saveAll(List.of(jobPost,jobPost1));

    }



}
