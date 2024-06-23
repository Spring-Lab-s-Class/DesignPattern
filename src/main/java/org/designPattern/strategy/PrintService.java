package org.designPattern.strategy;

import lombok.Builder;

import java.util.LinkedList;

//Context
@Builder
public class PrintService {

    private OrderPrinter printer;

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
