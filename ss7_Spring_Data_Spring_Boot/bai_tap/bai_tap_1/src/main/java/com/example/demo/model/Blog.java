package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String date;
    private String country;


    @OneToMany(mappedBy = "blog")
    private Set<Category> categories;

    public Blog() {
    }

    public Blog(int id, String name, String date, String country) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.country = country;
    }

    public Blog(int id, String name, String date, String country, Set<Category> categories) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.country = country;
        this.categories = categories;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
