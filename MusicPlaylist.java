import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Blinding Lights");
        playlist.add("Levitating");
        playlist.add("Perfect");

        System.out.println("Playlist: " + playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("Playing: " + firstSong);
        System.out.println("Playlist after playing first song: " + playlist);

        String lastSong = playlist.removeLast();
        System.out.println("Skipped: " + lastSong);
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}