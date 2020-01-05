package nl.ordina.junit5.musicservice;

public class MusicService {

    public void storeTrack(Song song) throws OverratedException {
        storeTrack(song.getArtist(), song.getTitle());
    }

    public void storeTrack(String artist, String song) throws OverratedException {
        if (artist==null){
            throw new IllegalArgumentException("artist may not be null");
        }

        if (song==null){
            throw new IllegalArgumentException("song may not be null");
        }

        validate(artist);
    }

    private void validate(String artist) throws OverratedException {
        if (artist.toUpperCase().contains("QUEEN")){
            throw new OverratedException("Queen is overrated");
        }
    }
}
