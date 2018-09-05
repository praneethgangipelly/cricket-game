package com.company;

public class Over {

    private int deliveryNumber;
    private int overNumber;

    public Over(int overNumber) {
        this.overNumber = overNumber;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public int getOverNumber() {
        return overNumber;
    }

    public void setOverNumber(int overNumber) {
        this.overNumber = overNumber;
    }
    public boolean delivery(String result){
        if (result.equals("wide")||result.equals("noball")){
            return false;
        }
        return true;
    }
}
