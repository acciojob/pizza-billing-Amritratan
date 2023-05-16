package com.driver;

public class ToppingsAdderImpl implements ToppingsAdder{
    static int vegToppingPrice = 70;
    static int nonVegToppingPrice = 120;

    @Override
    public int addToppings(Boolean veg, Boolean isToppingAdded) {
        if(isToppingAdded) return 0;
        return Boolean.TRUE.equals(veg) ? vegToppingPrice : nonVegToppingPrice;
    }
}