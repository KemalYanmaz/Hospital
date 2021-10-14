package com.hospital.utils;

import java.math.BigDecimal;

public class Payment {
    public static String toMoneyString(String currency, BigDecimal money){
        return money.toString()+" "+currency;
    }
}
