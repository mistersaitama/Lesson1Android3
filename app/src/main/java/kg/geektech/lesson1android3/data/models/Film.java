package kg.geektech.lesson1android3.data.models;

import com.google.gson.annotations.SerializedName;

public class Film {
    @SerializedName("id")
    String id;
    @SerializedName("title")
    String title;
    @SerializedName("original_title")
    String originalTitle;
    @SerializedName("description")
    String description;
    @SerializedName("director")
    String director;
    @SerializedName("producer")
    String producer;
    @SerializedName("release_date")
    String release_date;


    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getDescription() {
        return description;
    }
}
