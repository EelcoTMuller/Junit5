package nl.ordina.junit5.testdata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleParameterTest {
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void shoulsContainWhiteSpaces(String stringToTest) {
        assertTrue(StringUtils.containsWhitespace(stringToTest));
    }

    @ParameterizedTest
    @EmptySource
    @NullSource
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void shoulsContainWhiteSpacesAlsoNullAndEmptyInput(String stringToTest) {
        assertTrue(StringUtils.containsWhitespace(stringToTest));
    }
}
