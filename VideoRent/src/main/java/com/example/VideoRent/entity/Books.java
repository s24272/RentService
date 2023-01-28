package com.example.VideoRent.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "books")
@Entity
public class Books {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private LocalDate productionData;

    public Books() {
    }
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Books(int id, String title, String author, LocalDate productionData) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.productionData = productionData;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getProductionData() {
        return productionData;
    }

    public void setProductionData(LocalDate productionData) {
        this.productionData = productionData;
    }


}
