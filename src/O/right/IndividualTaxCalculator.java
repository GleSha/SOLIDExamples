package O.right;

import java.math.BigDecimal;

public class IndividualTaxCalculator implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.13));
    }
}
