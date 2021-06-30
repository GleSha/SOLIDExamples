package S.right;


import java.math.BigDecimal;

@RestController
@RequestMapping("/tax")
public class TaxCalculationController {


    private static final Logger logger = LoggerFactory.getLogger(TaxCalculationController.class);

    private final TaxCalculationService service;

    public TaxCalculationController(TaxCalculationService service) {
        this.service = service;
    }

    @GetMapping("/calculate/{value}")
    public BigDecimal calculateTax(@PathVariable("value") BigDecimal value) {
        logger.debug("calculate tax with value: " + value);
        return service.calculateTax(value);
    }

    //other methods
}
