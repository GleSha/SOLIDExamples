package D.wrong;

import java.math.BigDecimal;

public class IndividualTaxCalculator {

    public BigDecimal getIndividualTaxFromAmount(BigDecimal amount, String taxCalculationType) {
        if (taxCalculationType.equals("1")) {
            return amount.multiply(BigDecimal.valueOf(0.13));
        }
        if (taxCalculationType.equals("2")) {
            return amount.multiply(BigDecimal.valueOf(0.07));
        }
        return BigDecimal.ZERO;
    }

    //other methods for other taxes
}
