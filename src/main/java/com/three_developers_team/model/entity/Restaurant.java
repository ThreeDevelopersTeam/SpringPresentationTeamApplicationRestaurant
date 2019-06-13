package com.three_developers_team.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurant", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> users;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Kitchen> kitchens;

    public Restaurant() {
    }

    public Restaurant(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Restaurant(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Kitchen> getKitchens() {
        return kitchens;
    }

    public void setKitchens(List<Kitchen> kitchens) {
        this.kitchens = kitchens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id.equals(that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
