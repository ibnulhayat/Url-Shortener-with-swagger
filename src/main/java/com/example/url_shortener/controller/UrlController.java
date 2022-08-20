package com.example.url_shortener.controller;


import com.example.url_shortener.model.UrlLongRequestDto;
import com.example.url_shortener.service.UrlService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api")
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @ApiOperation(value = "Convert short url", notes = "Converts long url to short url")
    @PostMapping("create-short")
    public String convertToShortUrl(@RequestBody UrlLongRequestDto request) {
        return urlService.convertToShortUrl(request);
    }

    @ApiOperation(value = "return long url", notes = "Finds original url from short url and redirects")
    @GetMapping(value = "{shortUrl}")
    public String getShortUrl(@PathVariable String shortUrl) {
        return  urlService.getOriginalUrl(shortUrl);
    }
}
