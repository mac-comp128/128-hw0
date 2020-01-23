package comp128.hw0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOrderingTest {
    @Test
    public void testWasStarterCodeModified() {
        assertFalse(Arrays.equals(ArrayOrdering.getLargerLeftElements(new int[]{13, 3, 8, 5, 4, 7}), new int[]{13, 3, 8, 5, 4, 7} ));
    }

    //TODO: Write more tests.
}
