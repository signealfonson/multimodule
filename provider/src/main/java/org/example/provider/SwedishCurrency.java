package org.example.provider;

import org.example.service.Currency;

import java.math.BigDecimal;

public class SwedishCurrency implements Currency {
    @Override
    public String currencyConverter() {
        return BigDecimal.valueOf(1.0) + " SEK";
    }
}
