Problem Statement: 
To build a REST based app for asset management in a company. 
Description:
Any company has assets like laptops, keyboard, stationary items, furniture etc. It is important for a company to keep a track of these assets, their condition,
and assignment to people to ensure rightful use of these assets and keep a track of them.  A REST based app is required which will expose the following services :

Application if run on postman for data process.
Follow up the crud operation methods of rest api for the categories model and asset model.

Application has built with Spring boot, maven frameworks.with STS ide. RESTFUL api supports GET,PUT,POST,DELETE mappings

before proceeding with these please refer:
for h2 database:
http://localhost:8090/h2-console/

For swagger:
http://localhost:8090/swagger-ui.html

Rest controllers and URLS :

For GET :

1) With GET mapping ,for categories we have the "http://localhost:8090/getdata" which enables to fetch all the records from datastore


2) using GET : Fetch a assets record end point : http://localhost:8090/getasset


3)using POST : TO add to categories a new record end point: http://localhost:8090/postdata

4)using POST : TO add to Assets a new record end point: http://localhost:8090/assetdata

5)using DELETE : to remove the record from categories datastore end point: http://localhost:8090/delete/{id}

6)using DELETE : to remove the record from asset datastore end point: http://localhost:8090/delete/{name}

7)Using PUT : TO update an existing record Category end point:http://localhost:8090/postdata/{id}
7)Using PUT : TO update an existing record Asset end point:http://localhost:8090/postdata/{name}
