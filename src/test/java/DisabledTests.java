import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTests {
    @Test
    @Disabled
    void some1Test() {
        assertTrue(true);
    }
}
