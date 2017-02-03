package com.anatwine.brand.util;


import com.anatwine.brand.model.order.Order;
import com.anatwine.brand.model.order.*;

import java.util.ArrayList;
import java.util.List;


public class DemoTest {

    public static void main(String[] args) throws Exception {

        Orders orders = new Orders();
        List<Order> order = new ArrayList<Order>();
        Order order1 = new Order();
        //order1.

        OrderFile orderFile = new OrderFile();
        orderFile.setOrders(orders);

        //String xmlStirng = (String) XMLUtililty.getXMLStringFromObject(orderFile);

    }
}
