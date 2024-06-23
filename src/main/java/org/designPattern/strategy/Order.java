package org.designPattern.strategy;

import lombok.Builder;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;

    private LocalDate date;

    @Setter
    private double total;

    private Map<String, Double> items = new HashMap<>();

    @Builder
    public Order(String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public void addItem(String name, double price) {
        items.put(name, price);
        total += price;
    }
}
