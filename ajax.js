var happyCount, sadCount, angerCount, loveCount, fearCount, surpriseCount = 0

var happyKeyowrds = ["happy", "good"];
var sadKeywords = ["sad", "mad"];

// JavaScript source code
$.ajax({
    type: 'GET',
    dataType: 'jsonp',
    url: 'http://api.twitter.com/1/statuses/user_timeline.json',
    data: { screen_name: 'wentworthinst' },
    success: function (data, textStatus, XMLHttpRequest) {
        var tmp = false;
        var results = $('#twitter_results');
        //console.log(data);
        for (i in data) {

            //check against the happy and sad keywords arrays and see if any of those words exist in the tweet

            /*

           if (data[i].text.indexOf("happy") != -1) {
              happyCount++;
            }

            if (data[i].text.indexOf("anger") != -1) {
              angryCount++;
            }
            if (data[i].text.indexOf("love") != -1) {
                loveCount++;
            }
            if (data[i].text.indexOf("fear") != -1) {
                fearCount++;
            }
            if (data[i].text.indexOf("surprise") != -1) {
                surpriseCount++;
            }
            else {
               sadCount++;
            }
        
           //results.append(tmp);
        }
    },
    error: function (req, status, error) {
        alert('error: ' + status);
    }
});

//Parses incoming tweet and runs a check against the happy/sad keyword arrays to see if those words exists
function parseTweetMood(tweet) {

//iterate over happy keywords to see if any of them exists in the tweet. If so, increment the happy counter and break out of the loop. If no result is found, do the same for the sad keywords.

}



//[
   // "happytweets": 7,
   // "sadTweets": 6,
//]