package sn.esmt.mp2isi.currencyexchangeapi;

public class CurrencyExchangeDTO {
    private Long id;
    private String from;
    private String to;
    private double rateExchange;

    private CurrencyExchangeDTO() {

    }
    public CurrencyExchangeDTO(Long id, String from, String to, double rateExchange) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.rateExchange = rateExchange;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getRateExchange() {
        return rateExchange;
    }

    public void setRateExchange(double rateExchange) {
        this.rateExchange = rateExchange;
    }
}
