package com.example.VideoRent.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table(name = "video")
@Entity
public class Video {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private String title;
    @Column
    private LocalDate productionYear;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Video() {
    }

    public Video(int id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
