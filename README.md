# Url-Shortener API with swagger2
This is an API for Url shortener service like tiny url. 

Url shortener is service that converts long urls into short aliases to save space when sharing urls in messages, twitter, presentations etc.
When user opens short url, it will be automatically redirected to original (long) url.

#How to use API

#Long Url conver short url
  This is a post method. You can only pass the long url then this post method raturn a short url that have base url link and add 8 charecter token and this data store in SQL databse.
  
  
# Short url to long url
  when user click the short url then it call a get method and this get method collect the short token code and search this code in data base and return main url/ long url.
