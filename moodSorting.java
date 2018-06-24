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
		/*
		List<String> listAnger = Arrays.asList(anger);
		List<String> listHappy = Arrays.asList(anger);
		List<String> listLove = Arrays.asList(anger);
		List<String> listFear = Arrays.asList(anger);
		List<String> listSuprise = Arrays.asList(anger);
		List<String> listSadness = Arrays.asList(anger);
		*/	
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String tweet = input.nextLine();
		
		String[] tweetArr = tweet.split(" "); //takes tweet and splits into array of words separated with a space
		List<String> listTweet = Arrays.asList(tweetArr); // converts string array to list
		
		//System.out.println("Your message was: " + '\n');
		
		
		
		//Dictionary declarations
		String[] anger = {"anger", "mad", "disgusted"};
		String[] happy = {"happy", "joyful", "delighted"};
		String[] love = {"love", "endearing", "heartfelt"};
		String[] fear = {"fear", "afraid", "scared"};
		String[] surprise = {"surprise", "wow", "shocked"};
		String[] sadness = {"sadness", "unhappy", "depressed"};	
		
		
		String finalMood = "null"; //assigning a final mood string
		
		//these counts will help determine what mood a string represents
		int angerCount = 0;
		int happyCount = 0;
		int loveCount = 0;
		int fearCount = 0;
		int surpriseCount = 0;
		int sadnessCount = 0;
		
		
		//checking input string for anger keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(anger[0])) {
				angerCount++;
			}
			else if(listTweet.contains(anger[1])) {
				angerCount++;
			}
			else if(listTweet.contains(anger[2])) {
				angerCount++;
			}
			else {
				System.out.println("didn't contain anger");
			}
		};
		
		
		//checking input string for happy keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(happy[0])) {
				happyCount++;
			}
			else if(listTweet.contains(happy[1])) {
				happyCount++;
			}
			else if(listTweet.contains(happy[2])) {
				happyCount++;
			}
			else {
				System.out.println("didn't contain happy");
			}
		};
		
		
		//checking input string for love keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(love[0])) {
				loveCount++;
			}
			else if(listTweet.contains(love[1])) {
				loveCount++;
			}
			else if(listTweet.contains(love[2])) {
				loveCount++;
			}
			else {
				System.out.println("didn't contain love");
			}
		};
		
		//checking input string for fear keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(fear[0])) {
				fearCount++;
			}
			else if(listTweet.contains(fear[1])) {
				fearCount++;
			}
			else if(listTweet.contains(fear[2])) {
				fearCount++;
			}
			else {
				System.out.println("didn't contain fear");
			}
		};
		
		//checking input string for surprise keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(surprise[0])) {
				surpriseCount++;
			}
			else if(listTweet.contains(surprise[1])) {
				surpriseCount++;
			}
			else if(listTweet.contains(surprise[2])) {
				surpriseCount++;
			}
			else {
				System.out.println("didn't contain surprise");
			}
		};
		
		
		//checking input string for sadness keywords
		for(int i = 0; i < tweetArr.length; i++) {
			if(listTweet.contains(sadness[0])) {
				sadnessCount++;
			}
			else if(listTweet.contains(sadness[1])) {
				sadnessCount++;
			}
			else if(listTweet.contains(sadness[2])) {
				sadnessCount++;
			}
			else {
				System.out.println("didn't contain sadness");
			}
		};
		
		//if anger is the highest count, the final mood of the tweet is anger
		if(angerCount > happyCount && angerCount > loveCount && angerCount > fearCount && angerCount > surpriseCount && angerCount > sadnessCount) {
			finalMood = "anger";
		}
		//if happy is the highest count, the final mood of the tweet is happy
		else if (happyCount > angerCount && happyCount > loveCount && happyCount > fearCount && happyCount > surpriseCount && happyCount > sadnessCount) {
			finalMood = "happy";
		}
		//if love is the highest count, the final mood of the tweet is love
		else if (loveCount > angerCount && loveCount > happyCount && loveCount > fearCount && loveCount > surpriseCount && loveCount > sadnessCount) {
			finalMood = "love";
		}
		//if fear is the highest count, the final mood of the tweet is fear
		else if (fearCount > angerCount && fearCount > happyCount && fearCount > loveCount && fearCount > surpriseCount && fearCount > sadnessCount) {
			finalMood = "fear";
		}
		//if surprise is the highest count, the final mood of the tweet is surprise
		else if (surpriseCount > angerCount && surpriseCount > happyCount && surpriseCount > loveCount && surpriseCount > fearCount && surpriseCount > sadnessCount) {
			finalMood = "surprise";
		}
		//if sadness is the highest count, the final mood of the tweet is sadness
		else if (sadnessCount > angerCount && sadnessCount > happyCount && sadnessCount > loveCount && sadnessCount > fearCount && sadnessCount > surpriseCount) {
			finalMood = "sadness";
		}
		//if there's a tie anywhere
		else {
			finalMood = "ambiguous";
		}
		
		
		
		
		
		System.out.println("The final mood is: " + finalMood + '\n');
		System.out.println("The counts are: " + '\n');
		System.out.println("Angry Words: " + angerCount);
		System.out.println("Happy Words: " + happyCount);
		System.out.println("Love Words: " + loveCount);
		System.out.println("Fear Words: " + fearCount);
		System.out.println("Surprise Words: " + surpriseCount);
		System.out.println("Sadness Words: " + sadnessCount);
		
		input.close();
		
	}

}
