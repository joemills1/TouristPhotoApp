/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mine.touristphotobackend.entity;

/**
 *
 * @author joe
 */
public class PhotoEntity {
    private String image;
    private String description;
    private String photoId;
    private VenueEntity venue;

    public PhotoEntity(String image, String description) {
        this.image = image;
        this.description = description;
    }

    public PhotoEntity(String image, String description, String photoId, VenueEntity venue) {
        this.image = image;
        this.description = description;
        this.photoId = photoId;
        this.venue = venue;
    }

    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public VenueEntity getVenueId() {
        return venue;
    }

    public void setVenueId(VenueEntity venue) {
        this.venue = venue;
    }
    
    
    
}
