package D.wrong;

import java.math.BigDecimal;

public class OrganizationTaxCalculator {

    private String taxCalculationType;


    public BigDecimal getOrganizationTaxFromAmount(BigDecimal amount) throws Exception {
        if (taxCalculationType.equals("1")) {
            return amount.multiply(BigDecimal.valueOf(0.4));
        }
        if (taxCalculationType.equals("2")) {
            return amount.multiply(BigDecimal.valueOf(0.2));
        }
        throw new Exception("Unsupported tax calculation type");
    }

    public void setTaxCalculationType(String taxCalculationType) {
        this.taxCalculationType = taxCalculationType;
    }

    //other methods
}
