package com.example.test00_vendingmachine;

import java.io.Serializable;

public class MoneyDTO implements Serializable {

    int Money;

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
