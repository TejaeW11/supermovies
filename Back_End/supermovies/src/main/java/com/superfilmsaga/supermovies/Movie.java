package com.superfilmsaga.supermovies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.*;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    // Class fields
    @Id
    private ObjectId id;

    private String title;
    private String imdbID;
    private String releaseDate;
    private String trailerLink;
    private List<String> genre = new ArrayList<>();
    private String posterLink;
    private List<String> backdropList = new ArrayList<>();

    @DocumentReference
    private List<Review> reviewIds = new ArrayList<>();

//    public Movies(String title, String releaseDate, List<String> genre) {
//        this.title = title;
//        this.imdbID = "";
//        this.releaseDate = releaseDate;
//        this.trailerLink = "";
//        this.genre = genre;
//        this.posterLink = "";
//
//    }
//
//    public Movies(String title, String releaseDate, String trailerLink, List<String> genre, String posterLink) {
//        this.title = title;
//        this.imdbID = "";
//        this.releaseDate = releaseDate;
//        this.trailerLink = trailerLink;
//        this.genre = genre;
//        this.posterLink = posterLink;
//
//    }
//
//    public Movies(String title, String imdbID, String releaseDate, String trailerLink, List<String> genre, String posterLink) {
//        this.title = title;
//        this.imdbID = imdbID;
//        this.releaseDate = releaseDate;
//        this.trailerLink = trailerLink;
//        this.genre = genre;
//        this.posterLink = posterLink;
//
//    }
//
//    public Movies(String title, String imdbID, String releaseDate, String trailerLink,
//                  List<String> genre, String posterLink, List<String> backdropList) {
//        this.title = title;
//        this.imdbID = imdbID;
//        this.releaseDate = releaseDate;
//        this.trailerLink = trailerLink;
//        this.genre = genre;
//        this.posterLink = posterLink;
//
//        // Add image links to list...
//        this.backdropList = backdropList;
//    }
//
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public void addPoster(String newPoster){
//        posterLink = newPoster;
//    }
//
//    public void removePoster(){
//        posterLink = "";
//    }


}
