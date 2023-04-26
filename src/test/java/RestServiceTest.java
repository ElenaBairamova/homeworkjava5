import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.RestService;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")

    public void RestCalc(int income, int expense, int threshold, int expected) {
        RestService service = new RestService();

        int actual = service.CalcRestService(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

}

