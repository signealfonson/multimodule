package org.example.provider;

import org.example.service.Currency;

import java.math.BigDecimal;

public class SpanishCurrency implements Currency {

    @Override
    public String currencyConverter(){
        return BigDecimal.valueOf(11.38) + " EUR";
    }
}
