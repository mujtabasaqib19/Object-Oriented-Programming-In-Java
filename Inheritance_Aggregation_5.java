import java.util.ArrayList;
import java.util.List;
class Artist {
    String name;
    String getName() {
        return name;
    }
    Artist(String name) {
        this.name = name;
    }
}
class Album {
    String title;
    List<Song> songs;
    Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }
    void addSong(Song song) {
        this.songs.add(song);
    }
    List<Song> getSongs() {
        return songs;
    }
    String getTitle() { return title; }
}

class Song {
    List<Artist> artists;
    String title;
    Song(String title) {
        this.artists = new ArrayList<>();
        this.title = title;
    }

    void addArtist(Artist artist) {
        this.artists.add(artist);
    }
    String getTitle() {
        return title;
    }
    List<Artist> getArtists() {
        return artists;
    }
}
public class Inheritance_Aggregation_5 {
    public static void main(String[] args) {
        Artist A1 = new Artist("Atif Aslam");
        Artist A2 = new Artist("Shubh");

        Song S1 = new Song("Musafir");
        Song S2 =new Song("One love");
        Song S3 = new Song("Tham lo");
        Song S4 =new Song("Cheques");
        S1.addArtist(A1);
        S2.addArtist(A2);
        S3.addArtist(A1);
        S4.addArtist(A2);

        Album a1 = new Album("Sad songs");
        a1.addSong(S3);
        a1.addSong(S1);

        Album a2 = new Album("Punjabi");
        a2.addSong(S2);
        a2.addSong(S4);

        System.out.println("Album 1\n");
        List<Song> album1Songs = a1.getSongs();
        for (int i=0;i<album1Songs.size();i++) {
            Song song = album1Songs.get(i);
            System.out.println("Song Title "+song.getTitle());
            List<Artist> artists = song.getArtists();
            for (int j = 0; j < artists.size(); j++) {
                Artist artist = artists.get(j);
                System.out.println("Artist Name "+artist.getName());
            }
        }

        System.out.println("\nAlbum 2\n");
        List<Song> album2Songs = a2.getSongs();
        for (int i=0;i<album2Songs.size();i++) {
            Song song = album2Songs.get(i);
            System.out.println("Song Title "+song.getTitle());
            List<Artist> artists = song.getArtists();
            for (int j=0;j<artists.size();j++) {
                Artist artist = artists.get(j);
                System.out.println("Artist Name "+artist.getName());
            }
        }
    }
}