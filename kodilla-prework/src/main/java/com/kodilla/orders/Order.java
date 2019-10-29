package com.kodilla.orders;

public class Order {
    private String orderNo;
    private Double value;

    public Order(String orderNo, Double value){
        this.orderNo = orderNo;
        this.value = value;
    }

    private String getOrderNo(){
        return orderNo;
    }

    private Double getValue(){
        return value;
    }

    @Override
    public int hashCode(){
        return orderNo.length();
    }

    @Override
    public boolean equals(Object o){
        Order e = (Order) o;
        return (orderNo.equals(e.getOrderNo())) && (value.equals(e.getValue()));
    }

    @Override
    public String toString(){
        return orderNo + ", " + value + " PLN";
    }
}
