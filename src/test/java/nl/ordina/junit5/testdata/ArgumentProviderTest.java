package nl.ordina.junit5.testdata;

import nl.ordina.junit5.musicservice.MusicService;
import nl.ordina.junit5.musicservice.OverratedException;
import nl.ordina.junit5.musicservice.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ArgumentProviderTest {

    private MusicService service = new MusicService();

    @ParameterizedTest
    @ArgumentsSource(SongArgumentProvider.class)
    void allSongsOfQueenMustEndInError(Song song){
        OverratedException exception = Assertions.assertThrows(OverratedException.class, () -> {
            service.storeTrack(song);
        });
    }
}
