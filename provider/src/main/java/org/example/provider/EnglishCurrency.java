package org.example.provider;

import org.example.service.Currency;

import java.math.BigDecimal;

public class EnglishCurrency implements Currency {

    @Override
    public String currencyConverter() {
        return BigDecimal.valueOf(12.85) + " GBP";
    }
}
