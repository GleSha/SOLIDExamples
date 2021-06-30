package D.right;

import java.math.BigDecimal;

public interface TaxCalculator {
    BigDecimal calculateTax(BigDecimal amount, String taxCalculationType) throws Exception;
}
