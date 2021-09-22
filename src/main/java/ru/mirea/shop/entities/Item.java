package ru.mirea.shop.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @NotBlank(message = "Name cannot be empty")
    private String name;
//    @NotBlank(message = "Description cannot be empty")
    private String description;
//    @NotBlank(message = "Username cannot be empty")
    private Double price;
//    @NotBlank(message = "File must be attached")
    private String filename; // имя файла фотографии товара

    public Item() {
    }

    public Item(String name, String description, Double price, String filename) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.filename = filename;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
