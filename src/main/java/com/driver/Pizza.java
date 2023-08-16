package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int ExtraCheesePrice;
    private int ExtraToppingsPrice;
    private int paperbagPrice;
    private Boolean addExtraCheese;
    private Boolean addExtraToppings;
    private Boolean addTakeaway;
    private Boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) {
            this.basePrice = 300;
            this.ExtraToppingsPrice = 70;
        }
        else {
            this.basePrice = 400;
            this.ExtraToppingsPrice = 120;
        }
        this.ExtraCheesePrice = 80;
        this.paperbagPrice = 20;
        this.price = this.basePrice;

        addExtraCheese = false;
        addExtraToppings = false;
        addTakeaway = false;
        isBillGenerated = false;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!addExtraCheese) {
            this.price += this.ExtraCheesePrice;
            this.addExtraCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here

        if(!addExtraToppings) {
            this.price += this.ExtraToppingsPrice;
            this.addExtraToppings = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!addTakeaway) {
            this.price += this.paperbagPrice;
            this.addTakeaway = true;
        }

    }

    public String getBill(){
        // your code goes here

        if(!isBillGenerated) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";

            if(addExtraCheese) {
                this.bill += "Extra Cheese Added: " + this.ExtraCheesePrice + "\n";
            }
            if(addExtraToppings) {
                this.bill += "Extra Toppings Added: " + this.ExtraToppingsPrice + "\n";
            }

            if(addTakeaway) {
                this.bill += "Paperbag Added: " + this.paperbagPrice + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
