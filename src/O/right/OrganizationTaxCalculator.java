package O.right;

import java.math.BigDecimal;

public class OrganizationTaxCalculator implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.2));
    }
}
