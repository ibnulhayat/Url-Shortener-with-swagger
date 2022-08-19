package com.example.url_shortener.repository;


import com.example.url_shortener.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    public long findByShortUrl(String shortUrl);
}
