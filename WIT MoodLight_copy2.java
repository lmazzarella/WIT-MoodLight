import java.io.*;
import java.net.*;

import twitter4j.*;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;



class WITMoodLight {
	
	/*public boolean anger(String tweet){}
	public boolean happy(String tweet){}
	public boolean sadness(String tweet){}
	public boolean love(String tweet){}
	public boolean surprise(String tweet){}*/
    public static void main(String[] args) throws IOException {



	/* Info from Twitter:
		OAuth settings
		Your application's OAuth settings. Keep the "Consumer secret" a secret. 
		This key should never be human-readable in your application.
		via: https://dev.twitter.com/apps/new
		Access level Read and write 
		About the application permission model 
		Consumer key 0i228jWPp6uS9z2pUpQR9g 
		Consumer secret KVRtNcqqDzJDgIVGnz8yVjIiC1nsKnex8KRw8DeYyo8 
		Request token URL https://api.twitter.com/oauth/request_token 
		Authorize URL https://api.twitter.com/oauth/authorize 
		Access token URL https://api.twitter.com/oauth/access_token 
		Callback URL None 
		Your access token
		Use the access token string as your "oauth_token" and the access token secret as your "oauth_token_secret" to 
		sign requests with your own Twitter account. Do not share your oauth_token_secret with anyone. 
		Access token 587703594-2AH5spdoiDLsMFSPJLCEO1b2JdfyC4C2GJxKM9n7 
		Access token secret MBwhvTEZ1Bl4l84hbW7RWi5OvD6zZ59uwe5O9pn3U 
		Access level Read and write 
	*/
	
		//Dictionary declarations
		String[] anger = {"anger", "mad", "disgusted"};
		String[] happy = {"happy", "joyful", "delighted", "excited", "great", "encourage", "good"};
		String[] love = {"love", "endearing", "heartfelt"};
		String[] surprise = {"surprise", "wow", "shocked"};
		String[] sadness = {"sadness", "unhappy", "depressed"};	
		
		
		String finalMood = "null"; //assigning a final mood string
		
		//these counts will help determine what mood a string represents
		int final_angerCount = 0;
		int final_happyCount = 0;
		int final_loveCount = 0;
		int final_surpriseCount = 0;
		int final_sadnessCount = 0;

//Twitter API keys
		try {
			
			Twitter unauthenticatedTwitter = new TwitterFactory().getInstance();

			//String myAccount = "lmazzarella10";
			String message;
			String myConsumerKey = "HstQEPi29Zm1g9Z3ULC9ZXit2";
			String myConsumerSecret = "RDOuPsXc1jM4jq3Pia3z2CjkJRgyoJMYUtzyTeK9jBiZWSkx7L";
			String myAccessToken = "984102252150427648-0ntQTi82rLn9joNTYX6KiUmPjsRsQfP";
			String myAccessSecret = "fapV4o9Yb88BmWyNqY5sHK3shvpD1R3RGB3BViaunyzmj";
			//System.out.println("Acct '" + myAccount + "'");
			//System.out.println("CKey '" + myConsumerKey + "'");
			//System.out.println("CSecret '" + myConsumerSecret + "'");
			//System.out.println("AToken '" + myAccessToken + "'");
			//System.out.println("ASecret '" + myAccessSecret + "'");
			unauthenticatedTwitter.setOAuthConsumer(myConsumerKey, myConsumerSecret);
			AccessToken accessToken = new AccessToken(myAccessToken, myAccessSecret);
			unauthenticatedTwitter.setOAuthAccessToken(accessToken);
			//pulls all tweets from user's home timeline 
					//Status status = twitter.updateStatus(message);
					Paging page = new Paging(1,1000);
			List<Status> statuses = unauthenticatedTwitter.getUserTimeline("wentworthinst", page);
			//System.out.println("Showing home time line.");
			for (Status status : statuses) {
				String statusText = status.getText();
				System.out.println(status.getUser().getName() + ":" + statusText);

				String[] tweetArr = statusText.split(" "); //takes tweet and splits into array of words separated with a space
				//these counts will help determine what mood a string represents
				int angerCount = 0;
				int happyCount = 0;
				int loveCount = 0;
				int surpriseCount = 0;
				int sadnessCount = 0;

				//checking input string for anger keywords
				for(int i = 0; i < tweetArr.length; i++) {
					if(tweetArr[i].contains(anger[0])) {
						angerCount++;
					}
					else if(tweetArr[i].contains(anger[1])) {
						angerCount++;
					}
					else if(tweetArr[i].contains(anger[2])) {
						angerCount++;
					}
				//	else {
				//		System.out.println("didn't contain anger");
				//	}
				};
				
				
				//checking input string for happy keywords
				for(int i = 0; i < tweetArr.length; i++) {
					if(tweetArr[i].contains(happy[0])) {
						happyCount++;
					}
					else if(tweetArr[i].contains(happy[1])) {
						happyCount++;
					}
					else if(tweetArr[i].contains(happy[2])) {
						happyCount++;
					}
					//else {
						//System.out.println("didn't contain happy");
					//}
				};
				
				
				//checking input string for love keywords
				for(int i = 0; i < tweetArr.length; i++) {
					if(tweetArr[i].contains(love[0])) {
						loveCount++;
					}
					else if(tweetArr[i].contains(love[1])) {
						loveCount++;
					}
					else if(tweetArr[i].contains(love[2])) {
						loveCount++;
					}
					//else {
					//	System.out.println("didn't contain love");
					//}
				};
				
				//checking input string for surprise keywords
				for(int i = 0; i < tweetArr.length; i++) {
					if(tweetArr[i].contains(surprise[0])) {
						surpriseCount++;
					}
					else if(tweetArr[i].contains(surprise[1])) {
						surpriseCount++;
					}
					else if(tweetArr[i].contains(surprise[2])) {
						surpriseCount++;
					}
					//else {
					//	System.out.println("didn't contain surprise");
					//}
				};
				
				
				//checking input string for sadness keywords
				for(int i = 0; i < tweetArr.length; i++) {
					if(tweetArr[i].contains(sadness[0])) {
						sadnessCount++;
					}
					else if(tweetArr[i].contains(sadness[1])) {
						sadnessCount++;
					}
					else if(tweetArr[i].contains(sadness[2])) {
						sadnessCount++;
					}
					//else {
					//	System.out.println("didn't contain sadness");
					//}
				};
				
				HashMap<String, Integer> emotions = new HashMap<String, Integer>();

				// Inserting a variable
				emotions.put("anger", angerCount);
				emotions.put("happy", happyCount);
				emotions.put("sadness", sadnessCount);
				emotions.put("love", loveCount);
				emotions.put("surprise", surpriseCount);

				// Looking for biggest variable
				int biggestVal = 0;
				String biggestKey = "";
				for (HashMap.Entry<String, Integer> entry : emotions.entrySet()) {
					String key = entry.getKey();
					int val = entry.getValue();
					if (val > biggestVal){
						biggestVal = val;
						biggestKey = key;
					}
				}
				
				//TODO make array of emotions for faster searching
				//anger red - 2
				//happy green - 0
				//love purple - 1
				//surprise orange - 4
				//sadness blue - 3
				if (biggestKey == "angry"){
					final_angerCount++;
					}	else if (biggestKey == "happy"){
						final_happyCount++;
					
				}		 else if (biggestKey == "sadness"){
						final_sadnessCount++;
				
				} 		else if (biggestKey == "love"){
						final_loveCount++;
					
				} 		else if (biggestKey == "surprise"){
						final_surpriseCount++;
				
				} else {
					continue;
				}
			
			};
			
			


			HashMap<String, Integer> vars = new HashMap<String, Integer>();
			//String colorcode = "0";
			// Inserting a variable
			vars.put("anger", final_angerCount);
			vars.put("happy", final_happyCount);
			vars.put("sadness", final_sadnessCount);
			vars.put("love", final_loveCount);
			vars.put("surprise", final_surpriseCount);

			// Looking for biggest variable
			int biggestVal = 0;
			String biggestKey = "";
			for (Map.Entry<String, Integer> entry : vars.entrySet()) {
				String key = entry.getKey();
				int val = entry.getValue();
				if (val > biggestVal){
					biggestVal = val;
					biggestKey = key;
				}
			};
			
			/*if (biggestKey == "angry"){
					final_angerCount++;
					} else if (biggestKey == "happy"){
					final_happyCount++;
					
				} else if (biggestKey == "sadness"){
					final_sadnessCount++;
				
				} else if (biggestKey == "love"){
					final_loveCount++;
					
				} else if (biggestKey == "surprise"){
					final_surpriseCount++;
								}
			*/
			/*if (biggestKey == "angry"){
					colorcode = "2";
				} else if (biggestKey == "happy"){
					colorcode = "0";	
				} else if (biggestKey == "sadness"){
					colorcode = "3";
				
				} else if (biggestKey == "love"){
					colorcode = "1";
					
				} else if (biggestKey == "surprise"){
					colorcode = "4";
				
				}*/
			
				
				
			System.out.print("The final mood is: " + biggestKey);
			System.out.println("The counts are: " + '\n');
		System.out.println("Angry Words: " + final_angerCount);
		System.out.println("Happy Words: " + final_happyCount);
		System.out.println("Love Words: " + final_loveCount);
		System.out.println("Surprise Words: " + final_surpriseCount);
		System.out.println("Sadness Words: " + final_sadnessCount);
						System.exit(0);

		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		//		e.printStackTrace();
			System.exit(0);
		}
	}
}
