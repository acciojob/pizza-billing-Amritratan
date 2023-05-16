package com.driver;

public class ToppingsAdderImpl2 implements ToppingsAdder{

    static int vegToppingPrice = 80;
    static int nonVegToppingPrice = 120;

    static int vegToppingPrice2 = 40;
    @Override
    public int addToppings(Boolean veg, Boolean isToppingAdded) {
        if(veg.equals(Boolean.TRUE)) {
            return (isToppingAdded) ? vegToppingPrice2 : vegToppingPrice;
        }
        return nonVegToppingPrice;
    }
}