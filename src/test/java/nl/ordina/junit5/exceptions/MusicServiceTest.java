package nl.ordina.junit5.exceptions;

import nl.ordina.junit5.musicservice.MusicService;
import nl.ordina.junit5.musicservice.OverratedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicServiceTest {

    private MusicService service = new MusicService();

    @Test
    void testQueenEndsInOverratedException(){
        OverratedException exception = Assertions.assertThrows(OverratedException.class, () -> {
            service.storeTrack("Queen", "Bohemian Rhapsody");
        });

        assertTrue(exception.getMessage().contains("Queen"));
    }
}
