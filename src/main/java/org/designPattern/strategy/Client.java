package org.designPattern.strategy;

import java.util.LinkedList;

public class Client {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders(); //전체 order 출력
        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);
    }

    public static void createOrders() {
        Order o = Order.builder()
                .id("100")
                .build();

        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = Order.builder()
                .id("200")
                .build();

        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = Order.builder()
                .id("300")
                .build();

        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
