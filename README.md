1. To Create the Database execute shareyourviewsdb.sql scripts.
 
2. URL to get the access and refresh token

	http://localhost:8080/ShareYourViewsServices/oauth/token?grant_type=password&username=1&password=saurabh
	
	Authorization : Basic Auth
	username : trusted-app
	password : secret

3. To get the access token from refresh token

	http://localhost:8080/ShareYourViewsServices/oauth/token?grant_type=refresh_token&refresh_token=yourrefreshtoken
	
	Authorization : Basic Auth
	username : trusted-app
	password : secret

4. To Access the Resource

	http://localhost:8080/ShareYourViewsServices/PostHandle/getAllPosts?access_token=youraccesstoken