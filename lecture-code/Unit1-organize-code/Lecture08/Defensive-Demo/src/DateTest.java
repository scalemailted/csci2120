import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getDay() {
        Date date = new Date(365, 12,1999);
    }

    @Test
    void getMonth() {
        Date date = new Date(01, 120,1999);
    }

    @Test
    void getYear() {
        Date date = new Date(01, 01,-1999);
    }

    @Test
    void testToString() {
    }
}