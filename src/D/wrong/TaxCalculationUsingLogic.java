package D.wrong;

import java.math.BigDecimal;

public class TaxCalculationUsingLogic {

    public BigDecimal calculateTax(String clientType, BigDecimal amount, String taxCalculationType) {
        if (clientType.equals("individual")) {
            return new IndividualTaxCalculator().getIndividualTaxFromAmount(amount, taxCalculationType);
        }
        if (clientType.equals("organization")) {
            OrganizationTaxCalculator organizationTaxCalculator = new OrganizationTaxCalculator();
            organizationTaxCalculator.setTaxCalculationType(taxCalculationType);
            try {
                organizationTaxCalculator.getOrganizationTaxFromAmount(amount);
            } catch (Exception e) {
                e.printStackTrace();
                return BigDecimal.ZERO;
            }
        }
        return BigDecimal.ZERO;
    }

}
