package D.right;

import java.math.BigDecimal;
import java.util.Map;

public class TaxCalculatorUsingLogic {

    private Map<String, TaxCalculator> calculatorMap;

    public BigDecimal calculateTax(BigDecimal amount, String clientType, String taxCalculationType) {
        if (calculatorMap.containsKey(clientType)) {
            try {
                return calculatorMap.get(clientType).calculateTax(amount, taxCalculationType);
            } catch (Exception e) {
                e.printStackTrace();
                return BigDecimal.ZERO;
            }
        }
        else {
            return BigDecimal.ZERO;
        }
    }

}
