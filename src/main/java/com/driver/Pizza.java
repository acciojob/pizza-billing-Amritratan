package com.driver;

public class Pizza {

    //prices
    static int nonVegPizzaBasePrice = 400;
    static int vegPizzaBasePrice = 300;

    static int takeAwayPrice = 20;
    private int cheesePrice;
    private int toppingPrice;


    //flags
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private Boolean isVeg;
    private boolean isTakeAway;
    ToppingsAdder toppingsAdder;
    CheeseAdder cheeseAdder;
    BillGenerator billGenerator;
    private int price;

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }

    public boolean isToppingAdded() {
        return isToppingAdded;
    }


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.toppingsAdder = new ToppingsAdderImpl();
        this.cheeseAdder = new CheeseAdderImpl();
        this.billGenerator = new BillGeneratorImpl();
        this.price = getBasePrice();
        // your code goes here
    }

    public int getBasePrice() {
        return Boolean.TRUE.equals(isVeg) ? vegPizzaBasePrice : nonVegPizzaBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        int addCheeseprice = cheeseAdder.addCheese(isCheeseAdded);
        price += addCheeseprice;
        cheesePrice += addCheeseprice;
        isCheeseAdded = true;
    }

    public void addExtraToppings(){
        int addToppingPrice = toppingsAdder.addToppings(isVeg, isToppingAdded);
        price += addToppingPrice;
        toppingPrice += addToppingPrice;
        isToppingAdded = true;
    }

    public void addTakeaway(){
        if(!isTakeAway) this.price += takeAwayPrice;
        isTakeAway = true;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    public String getBill(){
        return billGenerator.generateBill(this);
    }

    public int getTakeAwayPrice() {
        return takeAwayPrice;
    }
}
