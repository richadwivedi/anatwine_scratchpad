package com.anatwine.brand.util;


import com.anatwine.brand.model.*;
import com.anatwine.brand.model.order.*;
import com.anatwine.brand.util.XmlUtility;

import java.util.ArrayList;
import java.util.List;


public class DemoTest {

    public static void main(String[] args) throws Exception {

        Address addr = new Address();
        addr.setFirstName("Jane");
        addr.setLastName("Doe");

        Order order1 = new Order();
        order1.setBillingAddress(addr);
        order1.setShippingAddress(addr);

        List<Order> order = new ArrayList<Order>();
        order.add(order1);
        order.add(order1);
        order.add(order1);
        Orders orders = new Orders();
        orders.getOrder().addAll(order);
        OrderFile orderFile = new OrderFile();
        orderFile.setOrders(orders);

        String xmlStirng = (String) com.anatwine.brand.util.XmlUtility.getXMLStringFromObject(orderFile);

    }
}
