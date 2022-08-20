package com.example.url_shortener.service;

import com.example.url_shortener.model.Url;
import com.example.url_shortener.model.UrlLongRequestDto;
import com.example.url_shortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UrlService {
    @Autowired
    private final UrlRepository urlRepository;
    private final BaseConversion conversion;

    public UrlService(UrlRepository urlRepository, BaseConversion baseConversion) {
        this.urlRepository = urlRepository;
        this.conversion = baseConversion;
    }

    public String convertToShortUrl(UrlLongRequestDto request) {
        Url url = new Url();
        url.setLongUrl(request.getLongUrl());
        url.setExpiresDate(new Date());
        url.setCreatedDate(new Date());
        long now = System.currentTimeMillis();
        Timestamp timeStamp= new Timestamp(now);
        url.setShortUrl(conversion.encode(timeStamp.getTime()));
        Url entity = urlRepository.save(url);

        return entity.getShortUrl();
    }

    public String getOriginalUrl(String shortUrl) {
        Url entity = urlRepository.findAll().stream().filter(url -> url.getShortUrl().equals(shortUrl)).findFirst().get();
        if (entity == null){
            return "Url dose not exist.";
        }
        return entity.getLongUrl();
    }
}
