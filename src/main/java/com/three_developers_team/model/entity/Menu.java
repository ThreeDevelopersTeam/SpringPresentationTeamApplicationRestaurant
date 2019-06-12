package com.three_developers_team.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_kitchen", nullable = false)
    private Kitchen kitchen;

    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY, cascade = CascadeType.DETACH, orphanRemoval = true)
    private List<Dish> dishes;

    public Menu() {
    }

    public Menu(long id, String mock) {
        this.id = id;
        this.name = mock;
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

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id) &&
                Objects.equals(name, menu.name) &&
                Objects.equals(kitchen, menu.kitchen) &&
                Objects.equals(dishes, menu.dishes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, kitchen, dishes);
    }


    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kitchen=" + kitchen +
                ", dishes=" + dishes +
                '}';
    }
}
