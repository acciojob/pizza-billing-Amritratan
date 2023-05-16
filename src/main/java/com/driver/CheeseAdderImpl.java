package com.driver;

public class CheeseAdderImpl implements CheeseAdder{
    static int cheesePrice = 80;


    @Override
    public int addCheese(boolean isCheeseAdded) {
        if(isCheeseAdded) return 0;
        return cheesePrice;
    }
}