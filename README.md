# ApiForRoadsideHelper
This is spring boot Rest API for My RoadsideHelper Android Project


This is my own create Spring boot Rest Api For My Roadside Helper Project 
here i use Mysql database.


Features use This Project:---

- Spring boot.
- Making mysql_query for Get data from Mysql database.
- Authentication and Authorization Using Java Spring Boot.
- Post And get Image Using Java Spring Boot.
- role based authentication and send notification
- Another Features Comming soon.....like spring security,JWT authentication etc.......

### Here i use  "JdbcTemplate jdbcTemplate;" for my custom query way this a way for make custom query another way in below  link

@https://github.com/MdGolam-Kibria/Spring_boot_CRUD_projectSpringMVC_SpringDataJPAThHibernateMySQLUsingHtmlForm/blob/master/src/main/java/com/example/controlProducts/productManager/Repository/ProductRepository.java



### For Send Notification to Firebase from spring boot application: - <br/>
1) First set on header:- <br/><br/>
Content-Type =application/json <br/>
Authorization = key=[yourFirebaseServerKey]
![image](https://user-images.githubusercontent.com/61331272/115994185-c07f3780-a5f7-11eb-801d-97c286652a73.png)
<br/>
2) set notification data to body like below:-<br/>
```
{
    "registration_ids":[
    	 "your device registration key",
       "your device registration key"
    	],
    "data": {
    	      "message": "Rich Notification testing (body)",
            "title": "Check this Mobile (title)"
    }
}

```
<br/>
<br/>
![image](https://user-images.githubusercontent.com/61331272/115994381-8d897380-a5f8-11eb-83b7-a24f075c1a2d.png)


