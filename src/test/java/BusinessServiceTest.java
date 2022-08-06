import org.junit.jupiter.api.Test;
import ru.netology.stats.services.BusinessService;

public class BusinessServiceTest {
@Test
    public void testYearlyProfit() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        int actual = service.getYearlyProfit(profit);

    }
    @Test
    public void secondTest() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        double actual = service.getAverage(profit);

    }
    @Test
    void thirdTest() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        int actual = service.getPeakSalesMonth(profit);

    }
    @Test
    void forthTest() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        int actual = service.getLowestSalesMonth(profit);

    }
    @Test
    void fifthTest() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        int actual = service.getAmountOfMonthsWithSalesHigherThanAv(profit);

    }
    @Test
    void sixthTest() {
        BusinessService service = new BusinessService();
        int[] profit = new int[] {
                9,75,234,748,121,534,11,97,3456,345,87,23
        };

        int actual = service.getAmountOfMonthsWithSalesLowerThanAv(profit);

    }

}
