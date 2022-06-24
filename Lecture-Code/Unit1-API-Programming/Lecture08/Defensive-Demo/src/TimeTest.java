import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TimeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSeconds() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            Time time = new Time(1,1,100);
        });
        assertEquals("seconds must be 0-59", thrown.getMessage());
    }

    @Test
    void testMinutes() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            Time time = new Time(1,100,0);
        });
        assertEquals("minute must be 0-59", thrown.getMessage());
    }

    @Test
    void testHours() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            Time time = new Time(24,0,0);
        });
        assertEquals("hour must be 0-23", thrown.getMessage());
    }

    @Test
    void getUniversal() {
    }

    @Test
    void testToString() {
    }
}