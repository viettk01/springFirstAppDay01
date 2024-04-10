package com.example.first.app.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private String brand;
}