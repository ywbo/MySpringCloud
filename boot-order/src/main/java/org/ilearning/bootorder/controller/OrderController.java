package org.ilearning.bootorder.controller;

import org.ilearning.bootorder.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能注释
 *
 * @author 2024-07-17
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    public List<Order> getOrders() {
        Order order1 = new Order();
        order1.setOrderId(1001);
        order1.setOrderName("手机");
        order1.setCustomerId(101);
        order1.setQuantityLevel("A");

        Order order2 = new Order();
        order2.setOrderId(1002);
        order2.setOrderName("电脑");
        order2.setCustomerId(102);
        order2.setQuantityLevel("B");

        List<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);

        return orders;
    }

}
