# Url-Shortener API with swagger2
This is an API for Url shortener service like tiny url. 

Url shortener is service that converts long urls into short aliases to save space when sharing urls in messages, twitter, presentations etc.
When user opens short url, it will be automatically redirected to original (long) url.

# POST Method (Long Url conver short url)
  This is a post method. You can only pass the long url then this post method raturn a short url that have base url link and add 8 charecter token and this data store in SQL databse.
  
  
# GET Method (Short url to long url)
  when user click the short url then it call a get method and this get method collect the short token code and search this code in data base and return main url/ long url if dosen't match short token then return exeption, this url not available or vaid.
  
#Project deployment documentation

#1.Create a Spring Boot WAR
  1.1 extended SpringBootServletInitializer this class
  1.2 Override the Configure method.
  1.3 Open the pom.xml file and marked the servlet container (Tomcat) as provided.
  1.4 We need to deploy WAR file so change the package type to WAR in pom.xml file.
  1.5 Modify the final WAR file name by using the <finalName> tag to avoid including the version numbers. We have created a WAR file with the name url-shortener.
  1.6 Editor right side you see Meven click this and then show your project name then click and see Lifecycle than again click and see package and than double click on the package then hold a minite and create a war file in target folder then see war file and this file deploy on the Apache tomcat sever. 


  
  
