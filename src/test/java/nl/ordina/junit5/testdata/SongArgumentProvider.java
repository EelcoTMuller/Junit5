package nl.ordina.junit5.testdata;

import nl.ordina.junit5.musicservice.Song;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class SongArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(new Song("Queen", "Bohemian Rhapsody"), new Song("Queen", "Mama mia")).map(Arguments::of);
    }
}
