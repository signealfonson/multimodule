import org.example.provider.EnglishCurrency;
import org.example.provider.SpanishCurrency;
import org.example.provider.SwedishCurrency;
import org.example.service.Currency;

module org.example.provider {
    requires org.example.service;
    provides Currency with SwedishCurrency, EnglishCurrency, SpanishCurrency;
}