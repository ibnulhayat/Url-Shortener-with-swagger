package com.example.url_shortener.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Url {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String longUrl;
    @Column(nullable = false)
    private String shortUrl;
    @Column(nullable = false)
    private Date createdDate;
    private Date expiresDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }


}
