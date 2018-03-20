package com.kodexlabs.nitangana;

/**
 * Created by Aritra on 15-08-2017.
 */

public class Feeds {

    private Long id;
    private Long image;
    private Long text;
    private Long details;
    private Long date;

    public Feeds(Long id, Long image, Long text, Long details, Long date) {
        this.id = id;
        this.image = image;
        this.text = text;
        this.details = details;
        this.date = date;
    }

    public Feeds(){
    }

    public Long getId() {
        return id;
    }

    public Long getImage() {
        return image;
    }

    public Long getText() {
        return text;
    }

    public Long getDetails() {
        return details;
    }

    public Long getDate() {
        return date;
    }
}
