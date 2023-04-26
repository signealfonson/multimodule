import org.example.service.Currency;

module org.example.consumer {
    requires org.example.service;
    uses Currency;
}