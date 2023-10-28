package sn.esmt.mp2isi.currencyexchangeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/currency-exchange")
public class Controller {

    private final List<CurrencyExchangeDTO> currencyExchangeDTOList;

    public Controller() {
        this.currencyExchangeDTOList = new ArrayList<>();
        currencyExchangeDTOList.add(new CurrencyExchangeDTO(1001L, "USD", "XOF", 609.50));
    }

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchangeDTO getRateExchange(@PathVariable String from, @PathVariable String to) {
        return currencyExchangeDTOList.stream().filter(c -> c.getFrom().equalsIgnoreCase(from) && c.getTo().equalsIgnoreCase(to))
                .findFirst()
                .orElse(new CurrencyExchangeDTO(1L, from, to, 1));
    }
}
