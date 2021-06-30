package S.wrong;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/tax")
public class TaxCalculationController {

    @GetMapping("/calculate/{value}")
    public BigDecimal calculateTax(@PathVariable("value") BigDecimal value) {
        System.out.println("GET /tax/calculate/ with parameter : " + value);
        return value.multiply(BigDecimal.valueOf(0.13)).add(value.divide(BigDecimal.valueOf(50), RoundingMode.CEILING).add(BigDecimal.valueOf(11)));
    }

    //other methods
}
