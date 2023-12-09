package com.niri.tp7_soa;

import com.niri.tp7_soa.gen.Country;
import com.niri.tp7_soa.gen.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();
    @PostConstruct
    public void initData() {
// initialize countries map
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("France");
        poland.setCapital("Paris");
        poland.setCurrency(Currency.EUR);
        poland.setPopulation(58186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("Maroc");
        uk.setCapital("Rabat");
        uk.setCurrency(Currency.DH);
        uk.setPopulation(37845000);

        countries.put(uk.getName(), uk);
    }
    public Country findCountry(String name) {
        return countries.get(name); }
}
