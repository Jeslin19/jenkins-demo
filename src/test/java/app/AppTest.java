package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testMsg() {
        assertEquals("Hello from Jenkins!", App.msg());
    }
}
