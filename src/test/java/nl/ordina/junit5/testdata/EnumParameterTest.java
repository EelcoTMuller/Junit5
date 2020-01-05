package nl.ordina.junit5.testdata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumParameterTest {

    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void testNotNull(TimeUnit unit){
        assertNotNull(unit);
    }
}
