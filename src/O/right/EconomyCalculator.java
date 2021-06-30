package O.right;

import java.math.BigDecimal;

public class EconomyCalculator {

    private TaxCalculator taxCalculator;


    public BigDecimal calculateTax(BigDecimal amount) {
        return taxCalculator.calculateTax(amount);
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    //other methods


}
