package com.example.demo.electronic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class e_Devices {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public e_Devices(int id, String name, String category, long price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public e_Devices() {
        super();
    }

}
