package org.katas.refactoring;

import java.util.List;

public class Order {
    private String name;
    private String address;
    private List<LineItem> lineList;

    public Order(String name, String address, List<LineItem> lineList) {
        this.name = name;
        this.address = address;
        this.lineList = lineList;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineList;
    }
}
