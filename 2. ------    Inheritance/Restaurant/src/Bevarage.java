import java.math.BigDecimal;

public class Bevarage extends Product {

    private double milliliters;

    public Bevarage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }
}
