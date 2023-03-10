package com.example.VideoRent.entity;

import com.example.VideoRent.enums.GameType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "games")
@Entity
public class Games {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private GameType type;
    @Column 
    private LocalDate productionData;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;


    public Games() {
    }

    public Games(int id, String name, GameType type, LocalDate productionData) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameType getType() {
        return type;
    }

    public void setType(GameType type) {
        this.type = type;
    }

    public LocalDate getProductionData() {
        return productionData;
    }

    public void setProductionData(LocalDate productionData) {
        this.productionData = productionData;
    }
}
