package com.javatechie.aws.cicd.example;

import lombok.Data;
import lombok.ToString;

@Data
public class Order {


    private int id;
    private String name;
    private int quantity;
    private long price;

    public Order(int id, String name, int quantity, long price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
