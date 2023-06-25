package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, director, cost);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track))
            tracks.add(track);
        else
            System.out.println("This track is already exist");
    }

    public void removeTrack(Track track) {
        if (!tracks.contains(track))
            System.out.println("Not found!");
        else
            tracks.remove(track);
    }

    public int getLength() {
        if (tracks == null) {
            tracks = new ArrayList<>();
        }
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("CD Length: " + getLength());

        for (Track track : tracks) {
            track.play();
        }
    }

}