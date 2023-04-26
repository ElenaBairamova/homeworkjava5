import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestService;

public class RestServiceTest {
    @Test
    public void RestCalc() {
        RestService service = new RestService();
        int expected = 2;
        int actual = service.CalcRestService(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RestCalculate() {
        RestService service = new RestService();
        int expected = 3;
        int actual = service.CalcRestService(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}