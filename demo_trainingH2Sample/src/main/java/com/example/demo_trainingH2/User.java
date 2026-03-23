package com.example.demo_trainingH2;

import jakarta.persistence.*;


@Entity
@Table(name = "users") // 'user' is a reserved keyword in some DBs, 'users' is safer
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Default Constructor, Getters, and Setters are REQUIRED
    public User() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
