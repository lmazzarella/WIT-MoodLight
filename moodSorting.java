import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class moodSorting {

	public static void main(String[] args) {
		
		/*basic test
		String tweet="This is testing my algorithm";		
		String extract="testing";		
		System.out.println(tweet.contains(extract));
		*/		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String tweet = input.nextLine();
		
		String[] tweetArr = tweet.split(" "); //takes tweet and splits into array of words separated with a space
		List<String> listTweet = Arrays.asList(tweetArr); // converts string array to list
		
		System.out.println("Your message was: " + '\n');
		
		
		
		//Dictionary declarations
		String[] anger = {"anger", "mad", "disgusted"};
		String[] happy = {"happy", "joyful", "delighted"};
		String[] love = {"love", "endearing", "heartfelt"};
		String[] fear = {"fear", "afraid", "scared"};
		String[] surprise = {"surprise", "wow", "shocked"};
		String[] sadness = {"sadness", "unhappy", "depressed"};
		
		/*
		List<String> listAnger = Arrays.asList(anger);
		List<String> listHappy = Arrays.asList(anger);
		List<String> listLove = Arrays.asList(anger);
		List<String> listFear = Arrays.asList(anger);
		List<String> listSuprise = Arrays.asList(anger);
		List<String> listSadness = Arrays.asList(anger);
		*/
		
		
		
		/*testing output
		for(int i = 0; i < tweetArr.length; i++) {
			System.out.println(tweetArr[i]);
		};
		*/
		
		//checking input string for keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(anger[0])) {
				System.out.println("categorize as anger");
			}
			else {
				System.out.println("didn't contain anger");
			}
		};
		
		
		
		input.close();
		
	}

}
