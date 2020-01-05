package nl.ordina.junit5.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowAllAssertionsTest {
    @Test
    void testMeerderAssertionsAllesWordtUigevoerd(){
        assertAll(
                () -> assertEquals("YYY","XXX", "Dit had gelijk moeten zijn"),
                () -> assertEquals("ZZZ", "ZZZ"),
                () -> assertEquals("AAA", "BBB")
        );
    }
}
