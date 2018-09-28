package test;

import java.util.List;

public class Order {

    private static Long id;
    private String orderNumber;
    private List<OrderRow> orderRows;

    public Order() {}

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<OrderRow> getOrderRows() {
        return orderRows;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderRows=" + orderRows +
                '}';
    }
}