package com.three_developers_team.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private Long id;

    @Column(name = "name")
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id) &&
                Objects.equals(name, menu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
