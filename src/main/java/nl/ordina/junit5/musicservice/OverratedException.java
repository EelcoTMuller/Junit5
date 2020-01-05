package nl.ordina.junit5.musicservice;

public class OverratedException extends Throwable {
    public OverratedException(String message) {
        super(message);
    }
}
