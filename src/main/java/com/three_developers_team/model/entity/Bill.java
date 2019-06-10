package com.three_developers_team.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bill")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "amount")
    private Integer amount;


    @Column(name = "paid")
    private int paid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return amount == bill.amount &&
                Objects.equals(name, bill.name) &&
                Objects.equals(date, bill.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, amount);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';

    }
}
