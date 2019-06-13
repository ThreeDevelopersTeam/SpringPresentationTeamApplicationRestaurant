package com.three_developers_team.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "nickname")
    private String nickname;

    @Enumerated
    @Column(name = "accesslevel")
    private AccessLevel accessLevel;

    @Column(name = "account")
    private Integer account;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_restaurant", nullable = false)
    private Restaurant restaurant;

    @ManyToMany(mappedBy = "users")
    private List<Bill> bills;

    public User() {
    }

    public User(String name, String password, String nickname, Restaurant restaurant) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.restaurant = restaurant;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(nickname, user.nickname) &&
                accessLevel == user.accessLevel &&
                Objects.equals(account, user.account) &&
                Objects.equals(restaurant, user.restaurant) &&
                Objects.equals(bills, user.bills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, nickname, accessLevel, account, restaurant, bills);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", accessLevel=" + accessLevel +
                ", account=" + account +
                ", restaurant=" + restaurant +
                ", bills=" + bills +
                '}';
    }
}
