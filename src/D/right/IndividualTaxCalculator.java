package D.right;

import java.math.BigDecimal;

public class IndividualTaxCalculator implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount, String taxCalculationType) {
        if (taxCalculationType.equals("1")) {
            return amount.multiply(BigDecimal.valueOf(0.13));
        }
        if (taxCalculationType.equals("2")) {
            return amount.multiply(BigDecimal.valueOf(0.07));
        }
        return BigDecimal.ZERO;
    }
}
