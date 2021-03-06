package com.example.workplanet.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genererar automatiskt ett id 1,2,3...
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Column(nullable = false)
    private String jobbCategory;

    @Column(nullable = false)
    @NotBlank
    private String title;

    @Column(nullable = false)
    @NotBlank
    private String subTitle;

    @Column(nullable = false)
    @NotBlank
    private String location;

    @ManyToOne //Flera JobPoster kan skapas av en User
    @JoinColumn(name = "appuser_id")
    private AppUser appUser;


    public JobPost(String jobbCategory, String title, String subTitle, String location, AppUser appUser) {
        this.jobbCategory = jobbCategory;
        this.title = title;
        this.subTitle = subTitle;
        this.location = location;
        this.appUser = appUser;
    }

    public JobPost() {

    }

    public String getJobbCategory() {
        return jobbCategory;
    }

    public void setJobbCategory(String jobbCategory) {
        this.jobbCategory = jobbCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}

