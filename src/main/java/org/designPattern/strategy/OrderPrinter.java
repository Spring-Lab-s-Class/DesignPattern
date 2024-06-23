package org.designPattern.strategy;

import java.util.Collection;

//전략
public interface OrderPrinter {

    void print(Collection<Order> orders);
}
