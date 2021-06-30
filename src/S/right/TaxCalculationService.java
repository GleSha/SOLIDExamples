package S.right;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class TaxCalculationService {

    public BigDecimal calculateTax(BigDecimal value) {
        return value.multiply(BigDecimal.valueOf(0.13)).add(value.divide(BigDecimal.valueOf(50), RoundingMode.CEILING).add(BigDecimal.valueOf(11)));
    }

}
