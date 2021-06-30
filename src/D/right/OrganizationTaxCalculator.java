package D.right;

import java.math.BigDecimal;

public class OrganizationTaxCalculator implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal amount, String taxCalculationType) throws Exception {
        if (taxCalculationType.equals("1")) {
            return amount.multiply(BigDecimal.valueOf(0.4));
        }
        if (taxCalculationType.equals("2")) {
            return amount.multiply(BigDecimal.valueOf(0.2));
        }
        throw new Exception("Unsupported tax calculation type");
    }
}
