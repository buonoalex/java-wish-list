package org.lessons.java.gift;

public class Gift {
    private String nameGift;

    //Getter and Setter
    public String getNameGift() {
        return nameGift;
    }

    public void setNameGift(String nameGift) {
        this.nameGift = nameGift;
    }

    //Costruttori
    public Gift(){

    }

    public Gift(String nameGift) {
        this.nameGift = nameGift;
    }
}
