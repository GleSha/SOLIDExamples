package O.wrong;

import java.math.BigDecimal;

public final class EconomyCalculator {

    //clientType: individual, organization
    public BigDecimal calculateTax(BigDecimal amount, String clientType) throws Exception {
        if (clientType.equals("individual")) {
            return amount.multiply(BigDecimal.valueOf(0.13));
        }
        if (clientType.equals("organization")) {
            return amount.multiply(BigDecimal.valueOf(0.2));
        }
        throw new Exception("Unsupported clientType: " + clientType);
    }

    //other methods for calculation other types of monetary relationship

}
